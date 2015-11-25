import java.io.*;
import java.util.*;

class IgniteRnd2_Q1{
	    public static void main(String[] args) throws IOException{
		            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			            String s = br.readLine();
				            int n = s.length();
					            StringBuffer ans=new StringBuffer("");
						            StringBuffer sb= new StringBuffer("");
							            for(int i=0;i<n;i++){
									                char ch = s.charAt(i);
											            if (Character.isLetter(ch) || Character.isDigit(ch) || ch=='-'){
													                    sb.append(Character.toString(ch));
															                }else{
																		                sb = sb.reverse();
																				                sb.append(Character.toString(ch));
																						                ans.append(sb);
																								                sb = new StringBuffer("");
																										            }
												            }
								            if(!sb.equals("")){
										                ans.append(sb.reverse());
												        }
									            System.out.println(ans);
										        }
}
