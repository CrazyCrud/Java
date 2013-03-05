package de.constantin.lehenmeier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class LogCounter {
	private Timer logTimer;
	private String inputPath, outputPath;
	private boolean resetReader;
	
	public LogCounter(String inputPath, String outputPath){
		this.inputPath = inputPath;
		this.outputPath = outputPath;
		logTimer = new Timer();
	}
	
	public void writeLogs(int rate){
		final int repeatTime = rate * 1000;
		final AtomicInteger count = new AtomicInteger();
		BufferedReader inputReader;
		final BufferedWriter outputWriter;
		try {
			inputReader = new BufferedReader(new FileReader(inputPath));
			outputWriter = new BufferedWriter(new FileWriter(outputPath));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		logTimer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run() {
				try {
					outputWriter.write("Logs in the last 3 seconds: " + count.getAndSet(0));
					setReaderStatus(true);
				} catch (IOException e) {
					cancel();
				}
			}
			
		}, repeatTime, repeatTime);
		while(true){
			try {
				if(isReaderReseted()){
					inputReader = new BufferedReader(new FileReader(inputPath));
					setReaderStatus(false);
				}
				if(inputReader.readLine() != null){
					count.incrementAndGet();
				}
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}
	
	private boolean isReaderReseted(){
		return resetReader;
	}
	
	private void setReaderStatus(boolean newStatus){
		resetReader = newStatus;
	}
}
