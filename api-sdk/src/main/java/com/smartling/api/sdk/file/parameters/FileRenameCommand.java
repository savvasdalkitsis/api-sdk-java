package com.smartling.api.sdk.file.parameters;

public class FileRenameCommand
{
    private String fileUri;
    private String newFileUri;

    public FileRenameCommand(String fileUri, String newFileUri)
    {
        this.fileUri = fileUri;
        this.newFileUri = newFileUri;
    }

    public String getFileUri()
    {
        return fileUri;
    }

    public void setFileUri(String fileUri)
    {
        this.fileUri = fileUri;
    }

    public String getNewFileUri()
    {
        return newFileUri;
    }

    public void setNewFileUri(String newFileUri)
    {
        this.newFileUri = newFileUri;
    }

}
