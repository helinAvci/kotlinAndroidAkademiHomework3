package com.helinavci.kotlinandroidakademihomework3

fun main() {
    val mainThread = mainThread()
    val thread1 = Thread1()
    val thread2 = Thread2()
    mainThread.start()
    thread1.start()
    thread2.start()

}
class Thread1: Thread() {
    public override fun run() {
        Thread.sleep(5000)
        println("thread1 has run.")
    }
}
class Thread2: Thread() {
    public override fun run() {
        Thread.sleep(3000)
        println("thread2 has run.")
    }
}
class mainThread: Thread() {
    public override fun run() {
        Thread.sleep(6000)
        println("main thread has run.")
    }
}