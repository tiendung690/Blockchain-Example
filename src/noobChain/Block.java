/*===================================================================
 * System Name : noobChain
 * Version     : 1.0.0
 * Create Date :  2019/09/05 9:08:19
 * Description :  Create By tien-dung
 * Coppy Right (c) 2019 By noobChain All Rights Reserved.	
 ====================================================================*/
package noobChain;

import java.util.Date;

public class Block {

	public String hash;
	public String previousHash;
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	
	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256( 
				previousHash +
				Long.toString(timeStamp) +
				data 
				);
		return calculatedhash;
	}

	//Block Constructor.
	public Block(String data,String previousHash ) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash(); //Making sure we do this after we set the other values.
	}
}
