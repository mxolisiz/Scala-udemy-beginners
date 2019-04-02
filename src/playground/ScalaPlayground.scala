package playground

object ScalaPlayground extends App {

  val kafkatopicName: String = "topic1";
  var isInitialized: Boolean = false;

  val aCodeBlock = {
    isInitialized = true;
    if (isInitialized) "Positive." else "Negative.";
  }

  ConfigureTopic(kafkatopicName, false)

  println(s"$kafkatopicName Is currently running? $aCodeBlock, Is initialized? $isInitialized");


  def FunctionNoParameters(): Int = kafkatopicName.length();

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

  def FactorialFunction(numberToUse: Int, factorToUse: Int): Int = numberToUse * factorToUse;

  def FactorialFunctionRecursive(numberToUse: Int): Int = {
    if (numberToUse <= 0) 1
    else numberToUse * FactorialFunctionRecursive(numberToUse - 1);
  }

  def FibonacciFunction(currentNumber: Int): Int = {
    if (currentNumber <= 2) return 1;
    else {
      FibonacciFunction(currentNumber - 1) + FibonacciFunction(currentNumber - 2);
    }
  }

  //TODO use auxillary function
  def IsPrime(testNumber: Int): Boolean = return testNumber % 2 > 0 || testNumber <= 1;


}