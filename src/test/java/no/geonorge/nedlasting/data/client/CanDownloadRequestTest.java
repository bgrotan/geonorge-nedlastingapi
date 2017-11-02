package no.geonorge.nedlasting.data.client;

import java.io.IOException;

import com.google.gson.Gson;

import junit.framework.TestCase;

public class CanDownloadRequestTest extends TestCase {

    public void testParse() throws IOException {
        String json = "{\"metadataUuid\":\"18777cf4-1f06-4cb0-803d-d6382b76681f\",\"coordinates\":\"189044 7043418 321736 6979780 244558 6893124 76662 6886354 65830 7013630 191752 7040710 190398 7046126 189044 7043418\",\"coordinateSystem\":\"32633\"}";
        CanDownloadRequest req = new Gson().fromJson(json, CanDownloadRequest.class);
        assertNotNull(req);
        assertEquals("18777cf4-1f06-4cb0-803d-d6382b76681f", req.getMetadataUuid());
        assertEquals(
                "189044 7043418 321736 6979780 244558 6893124 76662 6886354 65830 7013630 191752 7040710 190398 7046126 189044 7043418",
                req.getCoordinates());
        assertEquals("32633", req.getCoordinateSystem());

    }

}