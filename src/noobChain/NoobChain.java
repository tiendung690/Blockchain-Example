/*===================================================================
 * System Name : noobChain
 * Version     : 1.0.0
 * Create Date :  2019/09/05 9:08:43
 * Description :  Create By tien-dung
 * Coppy Right (c) 2019 By noobChain All Rights Reserved.	
 ====================================================================*/
package noobChain;

public class NoobChain {

	public static void main(String[] args) {
		
		Block genesisBlock = new Block("Hi im the first block", "0");
		System.out.println("Hash for block 1 : " + genesisBlock.hash);
		
		Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
		System.out.println("Hash for block 2 : " + secondBlock.hash);
		
		Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);
		System.out.println("Hash for block 3 : " + thirdBlock.hash);
		
	}
}
