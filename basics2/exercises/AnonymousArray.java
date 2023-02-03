class Calc
{
 	public int add(int nums[])
	{
		int result=0;
		for(int n:nums)
		{
			result=result+n;
		}
		return result;
	}
}


public class AnonymousArray{
	public static void main(String[] args){

	Calc obj= new Calc();
	int nums[]={5,2,3,7,8,2};
	int result=obj.add(nums);
	System.out.println(result);
	}
}


class Calc
{
 	public int add(int nums[])
	{
		int result=0;
		for(int n:nums)
		{
			result=result+n;
		}
		return result;
	}

public class AnonymousArray{
	public static void main(String[] args){

	Calc obj= new Calc();
	int result=obj.add(new int[]{5,2,3,7,8,2});
	System.out.println(result);
	}
}




