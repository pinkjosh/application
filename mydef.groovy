#!groovy

def Deploy() {
  def proc = "echo 'hello world!!!'".execute()
  def b = new StringBuffer()
  proc.consumeProcessErrorStream(b)
  println proc.text
  println b.toString()
}
return this;
