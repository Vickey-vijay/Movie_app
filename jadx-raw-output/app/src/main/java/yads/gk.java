package yads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f77833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f77834b;

    public final FileInputStream a() {
        if (this.f77834b.exists()) {
            this.f77833a.delete();
            this.f77834b.renameTo(this.f77833a);
        }
        return new FileInputStream(this.f77833a);
    }

    public final fk b() throws IOException {
        if (this.f77833a.exists()) {
            if (this.f77834b.exists()) {
                this.f77833a.delete();
            } else if (!this.f77833a.renameTo(this.f77834b)) {
                ih1.d("AtomicFile", "Couldn't rename file " + this.f77833a + " to backup file " + this.f77834b);
            }
        }
        try {
            return new fk(this.f77833a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f77833a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f77833a, e10);
            }
            try {
                return new fk(this.f77833a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f77833a, e11);
            }
        }
    }

    public gk(File file) {
        this.f77833a = file;
        this.f77834b = new File(file.getPath() + ".bak");
    }
}
