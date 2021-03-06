package no.geonorge.nedlasting.data.auto;

import org.apache.cayenne.CayenneDataObject;

import no.geonorge.nedlasting.data.DownloadOrder;

/**
 * Class _DownloadItem was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DownloadItem extends CayenneDataObject {

    public static final String COORDINATES_PROPERTY = "coordinates";
    public static final String EXTERNAL_JOB_ID_PROPERTY = "externalJobId";
    public static final String FILE_ID_PROPERTY = "fileId";
    public static final String FILE_NAME_PROPERTY = "fileName";
    public static final String METADATA_UUID_PROPERTY = "metadataUuid";
    public static final String SRID_PROPERTY = "srid";
    public static final String URL_PROPERTY = "url";
    public static final String ORDER_PROPERTY = "order";

    public static final String ORDER_ITEM_ID_PK_COLUMN = "ORDER_ITEM_ID";

    public void setCoordinates(String coordinates) {
        writeProperty(COORDINATES_PROPERTY, coordinates);
    }
    public String getCoordinates() {
        return (String)readProperty(COORDINATES_PROPERTY);
    }

    public void setExternalJobId(String externalJobId) {
        writeProperty(EXTERNAL_JOB_ID_PROPERTY, externalJobId);
    }
    public String getExternalJobId() {
        return (String)readProperty(EXTERNAL_JOB_ID_PROPERTY);
    }

    public void setFileId(String fileId) {
        writeProperty(FILE_ID_PROPERTY, fileId);
    }
    public String getFileId() {
        return (String)readProperty(FILE_ID_PROPERTY);
    }

    public void setFileName(String fileName) {
        writeProperty(FILE_NAME_PROPERTY, fileName);
    }
    public String getFileName() {
        return (String)readProperty(FILE_NAME_PROPERTY);
    }

    public void setMetadataUuid(String metadataUuid) {
        writeProperty(METADATA_UUID_PROPERTY, metadataUuid);
    }
    public String getMetadataUuid() {
        return (String)readProperty(METADATA_UUID_PROPERTY);
    }

    public void setSrid(Integer srid) {
        writeProperty(SRID_PROPERTY, srid);
    }
    public Integer getSrid() {
        return (Integer)readProperty(SRID_PROPERTY);
    }

    public void setUrl(String url) {
        writeProperty(URL_PROPERTY, url);
    }
    public String getUrl() {
        return (String)readProperty(URL_PROPERTY);
    }

    public void setOrder(DownloadOrder order) {
        setToOneTarget(ORDER_PROPERTY, order, true);
    }

    public DownloadOrder getOrder() {
        return (DownloadOrder)readProperty(ORDER_PROPERTY);
    }


}
