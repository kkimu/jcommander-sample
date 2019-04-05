import com.beust.jcommander.Parameter;
import com.beust.jcommander.converters.FileConverter;

import java.io.File;

class Args {
    @Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity")
    private Integer verbose = 1;

    @Parameter(names = "-debug", description = "Debug mode")
    private boolean debug = false;

    @Parameter(names = "-out",
            description = "File name",
            converter = FileConverter.class)
    private File file;

    void getFile() {
        System.out.println(this.file);
    }
}
