package com.threading

object ThreadingApp extends App {
  System.loadLibrary("threading")

  java.lang.Thread.sleep(5000)

  for (a ← 1 until 20000) {
    val t1 = new Thread().start()
  }

}
