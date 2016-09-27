package seedu.addressbook.storage;

import java.nio.file.Path;
import java.nio.file.Paths;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class Storage {
    
    public static final String DEFAULT_FILE_PATH = "";
    
    public final Path path;
    
    public Storage() throws IllegalValueException {
        this(DEFAULT_FILE_PATH);
    }
    
    public Storage(String filePath) throws IllegalValueException {
        this.path = Paths.get(filePath);
    }
    
    public void save(AddressBook addressBook) throws StorageOperationException {
    	
    }
    
    public AddressBook load() throws StorageOperationException {
        return null;
    }
    
    public String getPath() {
        return path.toString();
    }
}