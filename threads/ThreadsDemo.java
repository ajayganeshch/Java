package com.ajayganesh.threads;

public class ThreadsDemo {
  private ThreadsDemo() {}

  public static void show() {
    var status = new DownloadStatus();

    for (int i = 0; i < 10; i++) {
      var thread = new Thread(new DownloadFileTask(status));
      thread.start();
    }
  }
}
