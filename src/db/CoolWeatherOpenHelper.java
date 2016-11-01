package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	private static final int VERSION = 1;
	private static final String DBNAME = "account.db";
	
	public CoolWeatherOpenHelper(Context context) {
		super(context, DBNAME, null, VERSION);
	}

	// Province�������
	public static final String CREATE_PROVINCE = "create table Province ("
			+ "id integer primary key autoincrement, province_name text, "
			+ "province_code text)";

	// City�������
	public static final String CREATE_CITY = "create table City ("
			+ "id integer primary key autoincrement, city_name text, "
			+ "city_code text, province_id integer)";

	// County�������
	public static final String CREATE_COUNTY = "create table County ("
			+ "id integer primary key autoincrement, county_name text, "
			+ "county_code text, city_id integer)";

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVINCE); // ����Province��
		db.execSQL(CREATE_CITY); // ����City��
		db.execSQL(CREATE_COUNTY); // ����County��
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
	}
}