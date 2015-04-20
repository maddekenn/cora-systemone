package epc.systemone.record;

import epc.spider.data.SpiderDataGroup;
import epc.spider.data.SpiderDataRecord;

public interface SystemOneRecordHandler {

	SpiderDataRecord createRecord(String userId, String type, SpiderDataGroup record);

	SpiderDataRecord readRecord(String userId, String type, String id);

	void deleteRecord(String userId, String type, String id);

	SpiderDataRecord updateRecord(String userId, String type, String id, SpiderDataGroup record);

}
