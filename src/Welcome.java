class WelcomeProto
{
	public void display(String msg)
	{
		//String msg= this.msg;
		System.out.println("The message is \n Hi Learners "+msg);
	}
	public void greetingMessages(String msgs, String user)
	{
			System.out.println("Hi "+user+"\n "+msgs);
	}
	
}

class Welcome
{
	public static void main(String args[])
	{

		String message ="\n Welcome to Java";
		String member = "Raja";
		WelcomeProto wp =new WelcomeProto();
		wp.display(message);
		wp.greetingMessages(message,member);
	}
}