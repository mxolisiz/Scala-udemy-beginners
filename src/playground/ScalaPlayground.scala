package playground

import java.util.Calendar

object ScalaPlayground extends App {

  val kafkaTopicName: String = "topic1";
  var isInitialized: Boolean = false;

  val aCodeBlock = {
    isInitialized = true;
    if (isInitialized) "Positive." else "Negative.";
  }

  ConfigureTopic(kafkaTopicName, false)

  println(s"$kafkaTopicName Is currently running? $aCodeBlock, Is initialized? $isInitialized");
  println(FactorialRecursive(4))


  def TestForHadoopJobs():Unit= {
    val now = Calendar.getInstance()
    val currentHour = now.get(Calendar.HOUR_OF_DAY)
    val currentMinute = now.get(Calendar.MINUTE)
    val cuttOffHour = (currentHour)*60 + currentMinute + 25//windowMinute.toInt
    var presentHour = (currentHour)*60 + currentMinute
    println(s"$presentHour")
  }


  def FunctionNoParameters(): Int = kafkaTopicName.length();

  def ConfigureTopic(topicName: String, initKafka: Boolean): Boolean = {

    isInitialized = initKafka;
    return initKafka;

    if (initKafka) {
      isInitialized = true;
      true;
    }
    else
      false;
  }


  //instead of using a loop, AVOID LOOPS !!!! in functional programming, Use a recursive functions
  def ARepeatedFunction(stringValue: String, counter: Int): String = {
    if (counter == 1) stringValue
    else stringValue + ARepeatedFunction(stringValue, counter - 1);
  }


  //no code: code block allow you to define auxillary functions

  def OutPutKafkaTopicDetails(TopicName: String): String = s"Topic name: $TopicName, topic name length: " +
    TopicName.length();

  def FactorialRecursive(n:Int):Int= {
    if (n <= 0) 1
    else {
      n * FactorialRecursive(n - 1)
    }
  }


  def FibonacciFunction(num: Int): Int = {
    if (num <= 2) return 1;
    else {
      FibonacciFunction(num - 1) + FibonacciFunction(num - 2);
    }
  }

  //TODO use auxillary function
  def IsPrime(testNumber: Int): Boolean = return testNumber % 2 > 0 || testNumber <= 1;


}