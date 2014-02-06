package hudson.plugins.sloccount.model;


/**
 * Generic parsing results.
 * 
 * @author Michal Turek
 */
public interface SloccountReportInterface {
    /**
     * Add lines count.
     * 
     * @param filePath
     *            the file
     * @param languageName
     *            the language name
     * @param partName
     *            the part name
     * @param lineCount
     *            the line count
     */
    void add(String filePath, String languageName, String partName, int lineCount);

    /**
     * Get the root folder.
     * 
     * @return the root folder
     */
    String getRootFolder();
}
