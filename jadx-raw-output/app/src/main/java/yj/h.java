package yj;

import ck.p;
import java.io.File;
import kotlin.io.FileWalkDirection;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes10.dex */
public class h extends g {
    public static final d p(File file, FileWalkDirection fileWalkDirection) {
        p.j(file, "<this>");
        p.j(fileWalkDirection, "direction");
        return new d(file, fileWalkDirection);
    }

    public static /* synthetic */ d q(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return p(file, fileWalkDirection);
    }

    public static final d r(File file) {
        p.j(file, "<this>");
        return p(file, FileWalkDirection.TOP_DOWN);
    }
}
