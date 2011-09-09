package org.blanco.techmun.android.test;

import android.database.Cursor;
import android.net.Uri;
import android.test.AndroidTestCase;

public class ContentProviderTest extends AndroidTestCase {

	
	public void testEventosRequest(){
		Cursor c = 
		getContext().getContentResolver()
		.query(Uri.parse("content://org.blanco.techmun.android.mesasprovider/1/eventos"), 
				null, null, null, null);
		
		assertNotNull("Returned cursor is null", c);
	}
	
}
