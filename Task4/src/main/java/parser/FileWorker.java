package parser;

import java.io.Closeable;

public interface FileWorker extends Closeable{
    String findFirstTag();
    String findNextTag();
    String findContent();
}
