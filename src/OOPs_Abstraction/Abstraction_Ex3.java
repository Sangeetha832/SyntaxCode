package OOPs_Abstraction;

interface FileOperation{
	abstract void openFile(String filename);
	abstract void readFile();
	abstract void writeFile(String data);
	abstract void closeFile();
	
}
class TextFile implements FileOperation{
	private String filename;
	@Override
	public void openFile(String filename) {
		this.filename = filename;
		System.out.println("Opening text file: "+filename);
	}

	@Override
	public void readFile() {
		if(filename != null) {
			System.out.println("Reading text file: "+filename);
		}else {
			System.out.println("No file is open to read from");
		}
	}

	@Override
	public void writeFile(String data) {
		if(filename != null) {
			System.out.println("Writing to text file: "+filename+" with data "+data);
		}else {
			System.out.println("No filei is open to write to. ");
		}
	}

	@Override
	public void closeFile() {
		System.out.println("Closing text file: "+filename);
		filename = null;
	}
	
}
class BinaryFile implements FileOperation{

	private String filename;

    @Override
    public void openFile(String filename) {
        this.filename = filename;
        System.out.println("Opening binary file: " + filename);
    }

    @Override
    public void readFile() {
        if (filename != null) {
            System.out.println("Reading binary file: " + filename);
            //  Real implementation would read binary data
        } else {
            System.out.println("No file is open to read from.");
        }
    }

    @Override
    public void writeFile(String data) {
        if (filename != null) {
            System.out.println("Writing to binary file: " + filename + " with data: " + data);
            // Real implementation to write binary data
        } else {
            System.out.println("No file is open to write to.");
        }
    }

    @Override
    public void closeFile() {
        System.out.println("Closing binary file: " + filename);
        filename = null;
    }
	
}
public class Abstraction_Ex3 {
	public static void main(String[] args) {
		FileOperation text =  new TextFile();
		text.openFile("textfile.txt");
		text.readFile();
		text.writeFile("Some text data");
		text.closeFile();
		FileOperation binary = new BinaryFile();
		binary.openFile("data.dat");
		binary.readFile();
		binary.writeFile("Some binary data");
		binary.closeFile();
		
		
	}
}
