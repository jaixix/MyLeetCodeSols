class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t!=0)
	    {
	        String str=sc.next();
	        Stack<Character> st=new Stack<>();int sum=0;int c=0;
	        
	        for(int j=0;j<str.length();j++)
	        
	        {
	            if(st.isEmpty())
	            {sum+=c;c=0;}
	            
	            if(str.charAt(j)=='<')
	            {
	                st.push('<');
	                //System.out.println(st);
	                
	            }
	            else 
	            {
	                if(st.isEmpty())
	                break;
	                
	                if(st.peek()=='<');
	                {
	                    st.pop();
	                    //System.out.println(st);
	                    c+=2;
	                }
	            }
	            if(st.isEmpty())
	            {sum+=c;c=0;}
	            
	            
	            
	        }
	        
	        System.out.println(sum);
	        t--;
	        
	    }
	}
}