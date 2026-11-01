package com.facebook.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: compiled from: NativeAppCallAttachmentStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J$\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0007R\u001c\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/b0;", "", "Ljava/util/UUID;", "callId", "", "attachmentName", "Ljava/io/File;", "c", "", "create", "b", "createDirs", "a", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/io/File;", "attachmentsDirectory", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f14357a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = b0.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static File attachmentsDirectory;

    public static final File a(UUID callId, String attachmentName, boolean createDirs) throws IOException {
        ck.p.j(callId, "callId");
        File fileB = b(callId, createDirs);
        if (fileB == null) {
            return null;
        }
        try {
            return new File(fileB, URLEncoder.encode(attachmentName, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final File b(UUID callId, boolean create) {
        ck.p.j(callId, "callId");
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, callId.toString());
        if (create && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final File c(UUID callId, String attachmentName) throws FileNotFoundException {
        if (!j0.X(attachmentName) && callId != null) {
            try {
                return a(callId, attachmentName, false);
            } catch (IOException unused) {
                throw new FileNotFoundException();
            }
        }
        throw new FileNotFoundException();
    }
}
