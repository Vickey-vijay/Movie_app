package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import ck.p;
import com.facebook.internal.b0;
import com.ironsource.C3426d4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;
import kotlin.Metadata;
import lk.a0;

/* JADX INFO: compiled from: FacebookContentProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016JM\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006!"}, d2 = {"Lcom/facebook/FacebookContentProvider;", "Landroid/content/ContentProvider;", "", "onCreate", "Landroid/net/Uri;", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "", "", "strings", "s", "strings2", "s2", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "Landroid/content/ContentValues;", "contentValues", "insert", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", C3426d4.a.f28427t, "Landroid/os/ParcelFileDescriptor;", "openFile", "Landroid/util/Pair;", "Ljava/util/UUID;", "a", "<init>", "()V", "b", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14070c = FacebookContentProvider.class.getName();

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String s10, String[] strings) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strings, String s10, String[] strings2, String s11) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String s10, String[] strings) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return 0;
    }

    public final Pair<UUID, String> a(Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            String strSubstring = path.substring(1);
            p.i(strSubstring, "(this as java.lang.String).substring(startIndex)");
            Object[] array = a0.N0(strSubstring, new String[]{"/"}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            String str = strArr[0];
            String str2 = strArr[1];
            if ("..".contentEquals(str) || "..".contentEquals(str2)) {
                throw new Exception();
            }
            return new Pair<>(UUID.fromString(str), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        p.j(mode, C3426d4.a.f28427t);
        Pair<UUID, String> pairA = a(uri);
        if (pairA == null) {
            throw new FileNotFoundException();
        }
        try {
            b0 b0Var = b0.f14357a;
            File fileC = b0.c((UUID) pairA.first, (String) pairA.second);
            if (fileC != null) {
                return ParcelFileDescriptor.open(fileC, 268435456);
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException e10) {
            Log.e(f14070c, p.s("Got unexpected exception:", e10));
            throw e10;
        }
    }
}
