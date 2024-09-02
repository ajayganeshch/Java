package com.ajayganesh.threads;

public class DownloadFileTask implements Runnable {
  private DownloadStatus status;

  public DownloadFileTask(DownloadStatus status) {
    this.status = status;
  }

  @Override
  public void run() {
    System.out.println("Download a File...." + Thread.currentThread().getName());

    for (var i = 0; i < 10_000; i++) {
      System.out.println("Downloading byte " + i);
      status.incrementTotalBUTES();
    }

    System.out.println("Download Completed" + Thread.currentThread().getName());
  }
}
