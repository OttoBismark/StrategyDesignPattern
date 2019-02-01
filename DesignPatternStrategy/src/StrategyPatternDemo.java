
public class StrategyPatternDemo
{

	public static void main(String[] args)
	{
		Context context = new Context(new OperationAdd());
		System.out.println("Strategia = ADDIZIONE");
		System.out.println(context.executeStrategy(10, 5));
	
		Context context2 = new Context(new OperationMultiply());
		System.out.println("Stategia = MOLTIPLICAZIONE");
		System.out.println(context2.executeStrategy(3, 4));
		
		Context context3 = new Context(new OperationSubtraction());
		System.out.println("Strategia = SOTTRAZIONE");
		System.out.println(context3.executeStrategy(5, 2));
	}

}
