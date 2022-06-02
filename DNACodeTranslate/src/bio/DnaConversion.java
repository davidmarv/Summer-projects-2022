package bio;

import java.util.Scanner;

public class DnaConversion {


	
	
	
public static String strand;
public static String convertedStrand;
public static String type;
public static String mRNA;
public static String DNA;
	
	
	public static void main(String[] args) {
		
		//System.out.println(cleanString("a  sdf SD er sd"));
		
		//readmRNA("GUAUGCACGUGACUUUCCUCAUGAGCUGA");
		RnaOrDna();
		//Convert();

	}

	
	
	
	public static void RnaOrDna(){
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter DNA or RNA");
	    type = myObj.nextLine(); 
	    
	    System.out.println("please enter strand");
	    String str = myObj.nextLine(); 
	    strand = cleanString(str);
	    
	    Convert();
	    
	    System.out.println("Would you like to translate it: yes or no");
	    String transL = myObj.nextLine();
	    
	    if (transL.equals("yes"))
	    {
	    	readmRNA(mRNA);
	    }
	    
	    else 
	    {
	    	System.out.println("closed");
	    }
	}
	
	
	
	public static void Convert()
	{
		String[] s = strand.split("");
		convertedStrand = "";
		
		if (type.equals("DNA"))
		{
			for (int i = 0; i < s.length; i++)
			{
				String DNA = s[i];
				
				if (DNA.equals("G"))
				{
					convertedStrand += "C";
				}
				
				else if (DNA.equals("C"))
				{
					convertedStrand += "G";
				}
				
				else if (DNA.equals("A"))
				{
					convertedStrand += "U";
				}
				
				else if (DNA.equals("T"))
				{
					convertedStrand += "A";
				}
				
			}
			System.out.println("DNA to mRNA conversion complete");
			System.out.println("Original Strand DNA: " + strand);
			DNA = strand;
			System.out.println("Converted Strand mRNA: " + convertedStrand);
			mRNA = convertedStrand;
		}
			if (type.equals("RNA"))
			{
				for (int i = 0; i < s.length; i++)
				{
					String DNA = s[i];
					
					if (DNA.equals("C"))
					{
						convertedStrand += "G";
					}
					
					else if (DNA.equals("G"))
					{
						convertedStrand += "C";
					}
					
					else if (DNA.equals("U"))
					{
						convertedStrand += "A";
					}
					
					else if (DNA.equals("A"))
					{
						convertedStrand += "T";
					}
					
				}
				
		System.out.println("RNA to DNA conversion complete");
		System.out.println("Original Strand mRNA: " + strand);
		mRNA = strand;
		System.out.println("Converted Strand DNA: " + convertedStrand);
		DNA = convertedStrand;
		}

		
	}
	
	
	public static String cleanString(String s)
	{
		String str;
		str = s.replaceAll("\\s", "");
		str = str.toUpperCase();
		return str;
	}
	
	public static void readmRNA(String s)
	{
		String[] newString = s.split("");
		
		int i = 0;
		int start = 0;
		String fin = "";
		
		while (i+2 < newString.length)
		{
			String startTest = newString[i] + newString[i+1] + newString[i+2];
			i+=1;
			if (startTest.equals("AUG"))
			{
				//System.out.println("YES");
				start = i+2;
				fin += "start";
				break;
			}
			
		}
		
		while (start+2 < newString.length)
		{
			String nextVal = newString[start] + newString[start+1] + newString[start+2];
			
			start+= 3;
			
			
			
			if (nextVal.equals("GCU") || nextVal.equals("GCC") || nextVal.equals("GCA") || nextVal.equals("GCG"))
			{
				fin += "-Ala";
			}
			
			else if (nextVal.equals("CGU") || nextVal.equals("CGC") || nextVal.equals("CGA") || nextVal.equals("CGG")|| nextVal.equals("AGA") || nextVal.equals("AGG"))
			{
				fin += "-Arg";
			}
			
			else if (nextVal.equals("AAU") || nextVal.equals("AAC") )
			{
				fin += "-Asn";
			}
			
			else if (nextVal.equals("GAU") || nextVal.equals("GAC") )
			{
				fin += "-Asp";
			}
			
			else if (nextVal.equals("AAU") || nextVal.equals("AAC") || nextVal.equals("GAU") || nextVal.equals("GAC"))
			{
				fin += "-Asn";
			}
			else if (nextVal.equals("UGU") || nextVal.equals("UGC") )
			{
				fin += "-Cys";
			}
			
			else if (nextVal.equals("CAA") || nextVal.equals("CAG") )
			{
				fin += "-Gln";
			}
			
			else if (nextVal.equals("GAA") || nextVal.equals("GAG") )
			{
				fin += "-Glu";
			}
			
			else if (nextVal.equals("CAA") || nextVal.equals("CAG") || nextVal.equals("GAA") || nextVal.equals("GAG"))
			{
				fin += "-Gln";
			}
			
			else if (nextVal.equals("GGU") || nextVal.equals("GGC") || nextVal.equals("GGA") || nextVal.equals("GGG"))
			{
				fin += "-Gly";
			}
			
			else if (nextVal.equals("CAU") || nextVal.equals("CAC") )
			{
				fin += "-His";
			}
			
			else if (nextVal.equals("AUU") || nextVal.equals("AUC")|| nextVal.equals("AUA") )
			{
				fin += "-Ile";
			}
			
			else if (nextVal.equals("CUU") || nextVal.equals("CUC") || nextVal.equals("CUA") || nextVal.equals("CUG")|| nextVal.equals("UUA") || nextVal.equals("UUG"))
			{
				fin += "-Leu";
			}
			
			else if (nextVal.equals("AAA") || nextVal.equals("AAG") )
			{
				fin += "-Lys";
			}
			
			else if (nextVal.equals("AUG"))
			{
				fin += "-Met";
			}
			
			else if (nextVal.equals("UUU") || nextVal.equals("UUC") )
			{
				fin += "-Phe";
			}
			
			else if (nextVal.equals("CCU") || nextVal.equals("CCC") || nextVal.equals("CCA") || nextVal.equals("CCG"))
			{
				fin += "-Pro";
			}
			
			else if (nextVal.equals("UCU") || nextVal.equals("UCC") || nextVal.equals("UCA") || nextVal.equals("UCG")|| nextVal.equals("AGU") || nextVal.equals("AGC"))
			{
				fin += "-Ser";
			}
			
			else if (nextVal.equals("ACU") || nextVal.equals("ACC") || nextVal.equals("ACA") || nextVal.equals("ACG"))
			{
				fin += "-Thr";
			}
			
			else if (nextVal.equals("UGG"))
			{
				fin += "-Thr";
			}
			
			else if (nextVal.equals("UAU") || nextVal.equals("UAC") )
			{
				fin += "-Tyr";
			}
			
			else if (nextVal.equals("GUU") || nextVal.equals("GUC") || nextVal.equals("GUA") || nextVal.equals("GUG"))
			{
				fin += "-Val";
			}
			
			else if (nextVal.equals("UAA") || nextVal.equals("UGA")|| nextVal.equals("UAG") )
			{
				fin += "-STOP";
				break;
			}
			
			else
			{
				fin +="-_ _ _";
			}
		}
		
	System.out.println(fin);
	}
	
	
	
}
