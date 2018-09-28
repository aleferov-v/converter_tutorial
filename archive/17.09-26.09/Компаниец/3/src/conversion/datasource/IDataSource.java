package conversion.datasource;

import conversion.ConvertData;

/**
 * Общий источник данных
 */
public interface IDataSource {

    /**
     *
     * @return
     */
    ConvertData getConvertData();
}
