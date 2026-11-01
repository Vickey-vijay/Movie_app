package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.internal.j0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppEventDiskStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/d;", "", "Lcom/facebook/appevents/PersistedEvents;", "a", "eventsToPersist", "Lmj/r;", "b", "(Lcom/facebook/appevents/PersistedEvents;)V", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f14232a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = d.class.getName();

    /* JADX INFO: compiled from: AppEventDiskStore.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/facebook/appevents/d$a;", "Ljava/io/ObjectInputStream;", "Ljava/io/ObjectStreamClass;", "readClassDescriptor", "Ljava/io/InputStream;", "inputStream", "<init>", "(Ljava/io/InputStream;)V", "b", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            if (ck.p.e(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                classDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (ck.p.e(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                classDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            ck.p.i(classDescriptor, "resultClassDescriptor");
            return classDescriptor;
        }
    }

    public static final synchronized PersistedEvents a() {
        PersistedEvents persistedEvents;
        Throwable th2;
        a aVar;
        String str;
        String str2;
        y1.g.b();
        Context contextL = q1.t.l();
        persistedEvents = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = contextL.openFileInput("AppEventsLogger.persistedevents");
                ck.p.i(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                aVar = new a(new BufferedInputStream(fileInputStreamOpenFileInput));
                try {
                    Object object = aVar.readObject();
                    if (object == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                    }
                    PersistedEvents persistedEvents2 = (PersistedEvents) object;
                    j0.j(aVar);
                    try {
                        contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e10) {
                        Log.w(TAG, "Got unexpected exception when removing events file: ", e10);
                    }
                    persistedEvents = persistedEvents2;
                    if (persistedEvents == null) {
                        persistedEvents = new PersistedEvents();
                    }
                } catch (FileNotFoundException unused) {
                    j0.j(aVar);
                    try {
                        contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e11) {
                        e = e11;
                        str = TAG;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                } catch (Exception e12) {
                    e = e12;
                    Log.w(TAG, "Got unexpected exception while reading events: ", e);
                    j0.j(aVar);
                    try {
                        contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e13) {
                        e = e13;
                        str = TAG;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                j0.j(null);
                try {
                    contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e14) {
                    Log.w(TAG, "Got unexpected exception when removing events file: ", e14);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused2) {
            aVar = null;
        } catch (Exception e15) {
            e = e15;
            aVar = null;
        } catch (Throwable th4) {
            th2 = th4;
            j0.j(null);
            contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            throw th2;
        }
        return persistedEvents;
    }

    public static final void b(PersistedEvents eventsToPersist) {
        Context contextL = q1.t.l();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(contextL.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(eventsToPersist);
                j0.j(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(TAG, "Got unexpected exception while persisting events: ", th);
                    try {
                        contextL.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    j0.j(objectOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
