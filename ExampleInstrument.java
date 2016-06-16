abstract class Instrument
{	
	String name;
	abstract public void play();
}
class StringedInstrument extends Instrument
{
	int numberOfStrings;
	StringedInstrument(String n,int nos)
	{
		numberOfStrings=nos;
		name=n;
	}
	public void play()
	{
		System.out.println("This is :"+name);
		System.out.println(" there are "+numberOfStrings);
	}

}
class ElectricGuitar extends StringedInstrument
{
	public ElectricGuitar(String n,int nos)
	{
		super(n,nos);
	}
	
}

class ElectricBassGuitar extends StringedInstrument
{
	public ElectricBassGuitar(String n,int nos)
	{
		super(n,nos);
	}
	
}
public class ExampleInstrument
{
	public static void main (String args[])
	{
		ElectricBassGuitar EB=new ElectricBassGuitar("Bass Guitar",100);
		ElectricGuitar EG=new ElectricGuitar("Guitar",100);	
		EB.play();
		EG.play();
	}
}
