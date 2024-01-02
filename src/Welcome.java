class WelcomeProto
{
	public void display(String msg)
	{
		//String msg= this.msg;
		System.out.println("The message is \n "+msg);
	}
}

class Welcome
{
	public static void main(String args[])
	{
		String message ="Hi Learners,  \n \t Welcome to Java";
		
		WelcomeProto wp =new WelcomeProto();
		wp.display(message);
	}
}