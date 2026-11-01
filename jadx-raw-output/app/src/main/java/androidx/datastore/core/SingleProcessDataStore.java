package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import androidx.core.app.NotificationCompat;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import bk.a;
import bk.p;
import ck.i;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.g;
import mj.r;
import nj.b0;
import nj.s;
import nk.h;
import nk.j2;
import nk.l0;
import nk.u;
import nk.w;
import nk.w0;
import qk.c;
import qk.e;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 L*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003LMNBr\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\"\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\u00120\b\u0002\u0010I\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00120A\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\u0012\b\b\u0002\u0010,\u001a\u00020+ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rJ\u0013\u0010\u0011\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ?\u0010\u0018\u001a\u00028\u00002\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u001b\u001a\u00020\u0005*\u00020\u001aH\u0002J7\u0010\u001c\u001a\u00028\u00002\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010:\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R&\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<0;8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b=\u0010>\u0012\u0004\b?\u0010@RC\u0010C\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012\u0018\u00010A8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bC\u0010DR \u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", "T", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "read", "Lmj/r;", "handleRead", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Read;Lrj/c;)Ljava/lang/Object;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "update", "handleUpdate", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Update;Lrj/c;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "(Lrj/c;)Ljava/lang/Object;", "readAndInitOrPropagateFailure", "readAndInit", "readDataOrHandleCorruption", "readData", "Lkotlin/Function2;", "Lrj/c;", "", "transform", "Lkotlin/coroutines/d;", "callerContext", "transformAndWrite", "(Lbk/p;Lkotlin/coroutines/d;Lrj/c;)Ljava/lang/Object;", "Ljava/io/File;", "createParentDirectories", "updateData", "(Lbk/p;Lrj/c;)Ljava/lang/Object;", "newData", "writeData$datastore_core", "(Ljava/lang/Object;Lrj/c;)Ljava/lang/Object;", "writeData", "Lkotlin/Function0;", "produceFile", "Lbk/a;", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "Landroidx/datastore/core/CorruptionHandler;", "Lnk/l0;", "scope", "Lnk/l0;", "Lqk/c;", "data", "Lqk/c;", "getData", "()Lqk/c;", "", "SCRATCH_SUFFIX", "Ljava/lang/String;", "file$delegate", "Lmj/g;", "getFile", "()Ljava/io/File;", C3426d4.i.f28530b, "Lqk/l;", "Landroidx/datastore/core/State;", "downstreamFlow", "Lqk/l;", "getDownstreamFlow$annotations", "()V", "", "Landroidx/datastore/core/InitializerApi;", "initTasks", "Ljava/util/List;", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "actor", "Landroidx/datastore/core/SimpleActor;", "initTasksList", "<init>", "(Lbk/a;Landroidx/datastore/core/Serializer;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lnk/l0;)V", VastTagName.COMPANION, "Message", "UncloseableOutputStream", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class SingleProcessDataStore<T> implements DataStore<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @GuardedBy("activeFilesLock")
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final String SCRATCH_SUFFIX;
    private final SimpleActor<Message<T>> actor;
    private final CorruptionHandler<T> corruptionHandler;
    private final c<T> data;
    private final l<State<T>> downstreamFlow;

    /* JADX INFO: renamed from: file$delegate, reason: from kotlin metadata */
    private final g file;
    private List<? extends p<? super InitializerApi<T>, ? super rj.c<? super r>, ? extends Object>> initTasks;
    private final a<File> produceFile;
    private final l0 scope;
    private final Serializer<T> serializer;

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message;", "T", "", "()V", "lastState", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Read", "Update", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class Message<T> {

        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "T", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "lastState", "Landroidx/datastore/core/State;", "(Landroidx/datastore/core/State;)V", "getLastState", "()Landroidx/datastore/core/State;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Read<T> extends Message<T> {
            private final State<T> lastState;

            public Read(State<T> state) {
                super(null);
                this.lastState = state;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            public State<T> getLastState() {
                return this.lastState;
            }
        }

        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002BT\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR6\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "T", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "Lkotlin/Function2;", "Lrj/c;", "", "transform", "Lbk/p;", "getTransform", "()Lbk/p;", "Lnk/u;", "ack", "Lnk/u;", "getAck", "()Lnk/u;", "Landroidx/datastore/core/State;", "lastState", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Lkotlin/coroutines/d;", "callerContext", "Lkotlin/coroutines/d;", "getCallerContext", "()Lkotlin/coroutines/d;", "<init>", "(Lbk/p;Lnk/u;Landroidx/datastore/core/State;Lkotlin/coroutines/d;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
        public static final class Update<T> extends Message<T> {
            private final u<T> ack;
            private final d callerContext;
            private final State<T> lastState;
            private final p<T, rj.c<? super T>, Object> transform;

            public final u<T> getAck() {
                return this.ack;
            }

            public final d getCallerContext() {
                return this.callerContext;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            public State<T> getLastState() {
                return this.lastState;
            }

            public final p<T, rj.c<? super T>, Object> getTransform() {
                return this.transform;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Update(p<? super T, ? super rj.c<? super T>, ? extends Object> pVar, u<T> uVar, State<T> state, d dVar) {
                super(null);
                ck.p.j(pVar, "transform");
                ck.p.j(uVar, "ack");
                ck.p.j(dVar, "callerContext");
                this.transform = pVar;
                this.ack = uVar;
                this.lastState = state;
                this.callerContext = dVar;
            }
        }

        private Message() {
        }

        public /* synthetic */ Message(i iVar) {
            this();
        }

        public abstract State<T> getLastState();
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$UncloseableOutputStream;", "Ljava/io/OutputStream;", "", "b", "Lmj/r;", "write", "", "bytes", "off", "len", "close", "flush", "Ljava/io/FileOutputStream;", "fileOutputStream", "Ljava/io/FileOutputStream;", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "<init>", "(Ljava/io/FileOutputStream;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    public static final class UncloseableOutputStream extends OutputStream {
        private final FileOutputStream fileOutputStream;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.fileOutputStream.write(i10);
        }

        public UncloseableOutputStream(FileOutputStream fileOutputStream) {
            ck.p.j(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }

        public final FileOutputStream getFileOutputStream() {
            return this.fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            ck.p.j(bArr, "b");
            this.fileOutputStream.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            ck.p.j(bArr, "bytes");
            this.fileOutputStream.write(bArr, i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$handleUpdate$1, reason: invalid class name */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @tj.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SingleProcessDataStore<T> singleProcessDataStore, rj.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInit$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @tj.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    public static final class C08251 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08251(SingleProcessDataStore<T> singleProcessDataStore, rj.c<? super C08251> cVar) {
            super(cVar);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInit(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @tj.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    public static final class C08261 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08261(SingleProcessDataStore<T> singleProcessDataStore, rj.c<? super C08261> cVar) {
            super(cVar);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @tj.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    public static final class C08271 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08271(SingleProcessDataStore<T> singleProcessDataStore, rj.c<? super C08271> cVar) {
            super(cVar);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @tj.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    public static final class C08281 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08281(SingleProcessDataStore<T> singleProcessDataStore, rj.c<? super C08281> cVar) {
            super(cVar);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readData(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @tj.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    public static final class C08291 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08291(SingleProcessDataStore<T> singleProcessDataStore, rj.c<? super C08291> cVar) {
            super(cVar);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @tj.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    public static final class C08301 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08301(SingleProcessDataStore<T> singleProcessDataStore, rj.c<? super C08301> cVar) {
            super(cVar);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transformAndWrite(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(a<? extends File> aVar, Serializer<T> serializer, List<? extends p<? super InitializerApi<T>, ? super rj.c<? super r>, ? extends Object>> list, CorruptionHandler<T> corruptionHandler, l0 l0Var) {
        ck.p.j(aVar, "produceFile");
        ck.p.j(serializer, "serializer");
        ck.p.j(list, "initTasksList");
        ck.p.j(corruptionHandler, "corruptionHandler");
        ck.p.j(l0Var, "scope");
        this.produceFile = aVar;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = l0Var;
        this.data = e.t(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = b.a(new a<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            public final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final File invoke() {
                File file = (File) ((SingleProcessDataStore) this.this$0).produceFile.invoke();
                String absolutePath = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                synchronized (companion.getActiveFilesLock$datastore_core()) {
                    if (!(!companion.getActiveFiles$datastore_core().contains(absolutePath))) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    ck.p.i(absolutePath, "it");
                    activeFiles$datastore_core.add(absolutePath);
                }
                return file;
            }
        });
        this.downstreamFlow = v.a(UnInitialized.INSTANCE);
        this.initTasks = b0.O0(list);
        this.actor = new SimpleActor<>(l0Var, new bk.l<Throwable, r>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            public final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                if (th2 != null) {
                    ((SingleProcessDataStore) this.this$0).downstreamFlow.setValue(new Final(th2));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (activeFilesLock$datastore_core) {
                    companion.getActiveFiles$datastore_core().remove(singleProcessDataStore.getFile().getAbsolutePath());
                    r rVar = r.f64562a;
                }
            }
        }, new p<Message<T>, Throwable, r>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo1invoke(Object obj, Throwable th2) {
                invoke((SingleProcessDataStore.Message) obj, th2);
                return r.f64562a;
            }

            public final void invoke(SingleProcessDataStore.Message<T> message, Throwable th2) {
                ck.p.j(message, NotificationCompat.CATEGORY_MESSAGE);
                if (message instanceof SingleProcessDataStore.Message.Update) {
                    u<T> ack = ((SingleProcessDataStore.Message.Update) message).getAck();
                    if (th2 == null) {
                        th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    ack.g(th2);
                }
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    private static /* synthetic */ void getDownstreamFlow$annotations() {
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(p<? super T, ? super rj.c<? super T>, ? extends Object> pVar, rj.c<? super T> cVar) {
        u uVarC = w.c(null, 1, null);
        this.actor.offer(new Message.Update(pVar, uVarC, this.downstreamFlow.getValue(), cVar.getContext()));
        return uVarC.y(cVar);
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core", "()Ljava/util/Set;", "activeFilesLock", "getActiveFilesLock$datastore_core", "()Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRead(Message.Read<T> read, rj.c<? super r> cVar) throws Throwable {
        State<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof Data)) {
            if (value instanceof ReadException) {
                if (value == read.getLastState()) {
                    Object andInitOrPropagateFailure = readAndInitOrPropagateFailure(cVar);
                    return andInitOrPropagateFailure == sj.a.f() ? andInitOrPropagateFailure : r.f64562a;
                }
            } else {
                if (ck.p.e(value, UnInitialized.INSTANCE)) {
                    Object andInitOrPropagateFailure2 = readAndInitOrPropagateFailure(cVar);
                    return andInitOrPropagateFailure2 == sj.a.f() ? andInitOrPropagateFailure2 : r.f64562a;
                }
                if (value instanceof Final) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.SingleProcessDataStore$Message$Update, androidx.datastore.core.SingleProcessDataStore$Message$Update<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [androidx.datastore.core.SingleProcessDataStore$Message$Update] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [nk.u] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final Object handleUpdate(Message.Update<T> update, rj.c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objM3458constructorimpl;
        ?? r10;
        u ack;
        ?? r11;
        Object objTransformAndWrite;
        ?? r12;
        u uVar;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        boolean z10 = true;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    uVar = (u) anonymousClass1.L$0;
                } else if (i11 == 2) {
                    u uVar2 = (u) anonymousClass1.L$2;
                    SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) anonymousClass1.L$1;
                    Message.Update update2 = (Message.Update) anonymousClass1.L$0;
                    kotlin.c.b(obj);
                    ack = uVar2;
                    r11 = singleProcessDataStore;
                    r12 = (Message.Update<T>) update2;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = (Message.Update<T>) ((u) anonymousClass1.L$0);
                }
                kotlin.c.b(obj);
                update = uVar;
                objM3458constructorimpl = Result.m3458constructorimpl(obj);
                r10 = update;
                w.d(r10, objM3458constructorimpl);
                return r.f64562a;
            }
            kotlin.c.b(obj);
            ack = update.getAck();
            try {
                Result.a aVar = Result.Companion;
                State<T> value = this.downstreamFlow.getValue();
                if (value instanceof Data) {
                    p transform = update.getTransform();
                    d callerContext = update.getCallerContext();
                    anonymousClass1.L$0 = ack;
                    anonymousClass1.label = 1;
                    objTransformAndWrite = transformAndWrite(transform, callerContext, anonymousClass1);
                    if (objTransformAndWrite == objF) {
                        return objF;
                    }
                } else {
                    if (!(value instanceof ReadException)) {
                        z10 = value instanceof UnInitialized;
                    }
                    if (!z10) {
                        if (value instanceof Final) {
                            throw ((Final) value).getFinalException();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (value != update.getLastState()) {
                        throw ((ReadException) value).getReadException();
                    }
                    anonymousClass1.L$0 = update;
                    anonymousClass1.L$1 = this;
                    anonymousClass1.L$2 = ack;
                    anonymousClass1.label = 2;
                    if (readAndInitOrPropagateAndThrowFailure(anonymousClass1) == objF) {
                        return objF;
                    }
                    r11 = this;
                    r12 = update;
                }
                u uVar3 = ack;
                obj = objTransformAndWrite;
                update = uVar3;
                objM3458constructorimpl = Result.m3458constructorimpl(obj);
                r10 = update;
            } catch (Throwable th2) {
                th = th2;
                update = ack;
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                r10 = update;
            }
            w.d(r10, objM3458constructorimpl);
            return r.f64562a;
            p transform2 = r12.getTransform();
            d callerContext2 = r12.getCallerContext();
            anonymousClass1.L$0 = ack;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.label = 3;
            objTransformAndWrite = r11.transformAndWrite(transform2, callerContext2, anonymousClass1);
            if (objTransformAndWrite == objF) {
                return objF;
            }
            u uVar4 = ack;
            obj = objTransformAndWrite;
            update = uVar4;
            objM3458constructorimpl = Result.m3458constructorimpl(obj);
            r10 = update;
        } catch (Throwable th3) {
            th = th3;
        }
        w.d(r10, objM3458constructorimpl);
        return r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:34:0x00d8->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    public final Object readAndInit(rj.c<? super r> cVar) throws Throwable {
        C08251 c08251;
        wk.a aVarB;
        Ref$ObjectRef ref$ObjectRef;
        ?? r10;
        Ref$ObjectRef ref$ObjectRef2;
        ?? r12;
        Ref$ObjectRef ref$ObjectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        wk.a aVar;
        Ref$BooleanRef ref$BooleanRef;
        wk.a aVar2;
        ?? r11;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$BooleanRef ref$BooleanRef2;
        p pVar;
        ?? r13;
        if (cVar instanceof C08251) {
            c08251 = (C08251) cVar;
            int i10 = c08251.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c08251.label = i10 - Integer.MIN_VALUE;
            } else {
                c08251 = new C08251(this, cVar);
            }
        } else {
            c08251 = new C08251(this, cVar);
        }
        T t10 = (T) c08251.result;
        Object objF = sj.a.f();
        int i11 = c08251.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ref$ObjectRef = (Ref$ObjectRef) c08251.L$3;
                ref$ObjectRef2 = (Ref$ObjectRef) c08251.L$2;
                aVarB = (wk.a) c08251.L$1;
                SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) c08251.L$0;
                kotlin.c.b(t10);
                r10 = singleProcessDataStore;
            } else if (i11 == 2) {
                it = (Iterator) c08251.L$5;
                singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) c08251.L$4;
                ref$BooleanRef = (Ref$BooleanRef) c08251.L$3;
                ref$ObjectRef3 = (Ref$ObjectRef) c08251.L$2;
                aVar = (wk.a) c08251.L$1;
                SingleProcessDataStore singleProcessDataStore2 = (SingleProcessDataStore) c08251.L$0;
                kotlin.c.b(t10);
                r12 = singleProcessDataStore2;
                while (it.hasNext()) {
                    pVar = (p) it.next();
                    c08251.L$0 = r12;
                    c08251.L$1 = aVar;
                    c08251.L$2 = ref$ObjectRef3;
                    c08251.L$3 = ref$BooleanRef;
                    c08251.L$4 = singleProcessDataStore$readAndInit$api$1;
                    c08251.L$5 = it;
                    c08251.label = 2;
                    if (pVar.mo1invoke(singleProcessDataStore$readAndInit$api$1, c08251) == objF) {
                        return objF;
                    }
                }
                ref$ObjectRef2 = ref$ObjectRef3;
                aVar2 = aVar;
                r11 = r12;
                r11.initTasks = null;
                c08251.L$0 = r11;
                c08251.L$1 = ref$ObjectRef2;
                c08251.L$2 = ref$BooleanRef;
                c08251.L$3 = aVar2;
                c08251.L$4 = null;
                c08251.L$5 = null;
                c08251.label = 3;
                if (aVar2.a(null, c08251) == objF) {
                    return objF;
                }
                ref$ObjectRef4 = ref$ObjectRef2;
                ref$BooleanRef2 = ref$BooleanRef;
                r13 = r11;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (wk.a) c08251.L$3;
                ref$BooleanRef2 = (Ref$BooleanRef) c08251.L$2;
                ref$ObjectRef4 = (Ref$ObjectRef) c08251.L$1;
                SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) c08251.L$0;
                kotlin.c.b(t10);
                r13 = singleProcessDataStore3;
            }
            try {
                ref$BooleanRef2.element = true;
                r rVar = r.f64562a;
                aVar2.b(null);
                l<State<T>> lVar = r13.downstreamFlow;
                T t11 = ref$ObjectRef4.element;
                lVar.setValue(new Data(t11, t11 != null ? t11.hashCode() : 0));
                return r.f64562a;
            } catch (Throwable th2) {
                aVar2.b(null);
                throw th2;
            }
        }
        kotlin.c.b(t10);
        if (!(ck.p.e(this.downstreamFlow.getValue(), UnInitialized.INSTANCE) || (this.downstreamFlow.getValue() instanceof ReadException))) {
            throw new IllegalStateException("Check failed.".toString());
        }
        aVarB = wk.g.b(false, 1, null);
        ref$ObjectRef = new Ref$ObjectRef();
        c08251.L$0 = this;
        c08251.L$1 = aVarB;
        c08251.L$2 = ref$ObjectRef;
        c08251.L$3 = ref$ObjectRef;
        c08251.label = 1;
        t10 = (T) readDataOrHandleCorruption(c08251);
        if (t10 == objF) {
            return objF;
        }
        r10 = this;
        ref$ObjectRef2 = ref$ObjectRef;
        ref$ObjectRef.element = t10;
        Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$2 = new SingleProcessDataStore$readAndInit$api$1(aVarB, ref$BooleanRef3, ref$ObjectRef2, r10);
        List<? extends p<? super InitializerApi<T>, ? super rj.c<? super r>, ? extends Object>> list = r10.initTasks;
        if (list == null) {
            aVar2 = aVarB;
            ref$BooleanRef = ref$BooleanRef3;
            r11 = r10;
        } else {
            r12 = r10;
            ref$ObjectRef3 = ref$ObjectRef2;
            singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$2;
            it = list.iterator();
            aVar = aVarB;
            ref$BooleanRef = ref$BooleanRef3;
            while (it.hasNext()) {
                pVar = (p) it.next();
                c08251.L$0 = r12;
                c08251.L$1 = aVar;
                c08251.L$2 = ref$ObjectRef3;
                c08251.L$3 = ref$BooleanRef;
                c08251.L$4 = singleProcessDataStore$readAndInit$api$1;
                c08251.L$5 = it;
                c08251.label = 2;
                if (pVar.mo1invoke(singleProcessDataStore$readAndInit$api$1, c08251) == objF) {
                    return objF;
                }
            }
            ref$ObjectRef2 = ref$ObjectRef3;
            aVar2 = aVar;
            r11 = r12;
        }
        r11.initTasks = null;
        c08251.L$0 = r11;
        c08251.L$1 = ref$ObjectRef2;
        c08251.L$2 = ref$BooleanRef;
        c08251.L$3 = aVar2;
        c08251.L$4 = null;
        c08251.L$5 = null;
        c08251.label = 3;
        if (aVar2.a(null, c08251) == objF) {
            return objF;
        }
        ref$ObjectRef4 = ref$ObjectRef2;
        ref$BooleanRef2 = ref$BooleanRef;
        r13 = r11;
        ref$BooleanRef2.element = true;
        r rVar2 = r.f64562a;
        aVar2.b(null);
        l<State<T>> lVar2 = r13.downstreamFlow;
        T t12 = ref$ObjectRef4.element;
        lVar2.setValue(new Data(t12, t12 != null ? t12.hashCode() : 0));
        return r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readAndInitOrPropagateAndThrowFailure(rj.c<? super r> cVar) throws Throwable {
        C08261 c08261;
        SingleProcessDataStore singleProcessDataStore;
        if (cVar instanceof C08261) {
            c08261 = (C08261) cVar;
            int i10 = c08261.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c08261.label = i10 - Integer.MIN_VALUE;
            } else {
                c08261 = new C08261(this, cVar);
            }
        } else {
            c08261 = new C08261(this, cVar);
        }
        Object obj = c08261.result;
        Object objF = sj.a.f();
        int i11 = c08261.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = (SingleProcessDataStore) c08261.L$0;
            try {
                kotlin.c.b(obj);
                return r.f64562a;
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                throw th;
            }
        }
        kotlin.c.b(obj);
        try {
            c08261.L$0 = this;
            c08261.label = 1;
            if (readAndInit(c08261) == objF) {
                return objF;
            }
            return r.f64562a;
        } catch (Throwable th3) {
            th = th3;
            singleProcessDataStore = this;
            singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readAndInitOrPropagateFailure(rj.c<? super r> cVar) throws Throwable {
        C08271 c08271;
        SingleProcessDataStore singleProcessDataStore;
        if (cVar instanceof C08271) {
            c08271 = (C08271) cVar;
            int i10 = c08271.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c08271.label = i10 - Integer.MIN_VALUE;
            } else {
                c08271 = new C08271(this, cVar);
            }
        } else {
            c08271 = new C08271(this, cVar);
        }
        Object obj = c08271.result;
        Object objF = sj.a.f();
        int i11 = c08271.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            try {
                c08271.L$0 = this;
                c08271.label = 1;
                if (readAndInit(c08271) == objF) {
                    return objF;
                }
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore = this;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = (SingleProcessDataStore) c08271.L$0;
            try {
                kotlin.c.b(obj);
            } catch (Throwable th3) {
                th = th3;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
            }
        }
        return r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, rj.c] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.datastore.core.Serializer, androidx.datastore.core.Serializer<T>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object readData(rj.c<? super T> cVar) throws Throwable {
        ?? c08281;
        ?? fileInputStream;
        Throwable th2;
        ?? r10;
        if (cVar instanceof C08281) {
            C08281 c08282 = (C08281) cVar;
            int i10 = c08282.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c08282.label = i10 - Integer.MIN_VALUE;
                c08281 = c08282;
            } else {
                c08281 = new C08281(this, cVar);
            }
        } else {
            c08281 = new C08281(this, cVar);
        }
        Object obj = c08281.result;
        Object objF = sj.a.f();
        int i11 = c08281.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) c08281.L$2;
                fileInputStream = (Closeable) c08281.L$1;
                c08281 = (SingleProcessDataStore) c08281.L$0;
                try {
                    kotlin.c.b(obj);
                    r10 = fileInputStream;
                    yj.b.a(r10, th2);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        yj.b.a(fileInputStream, th);
                        throw th4;
                    }
                }
            }
            kotlin.c.b(obj);
            try {
                fileInputStream = new FileInputStream(getFile());
                try {
                    Serializer<T> serializer = this.serializer;
                    c08281.L$0 = this;
                    c08281.L$1 = fileInputStream;
                    c08281.L$2 = null;
                    c08281.label = 1;
                    Object from = serializer.readFrom(fileInputStream, c08281);
                    if (from == objF) {
                        return objF;
                    }
                    th2 = null;
                    obj = from;
                    r10 = fileInputStream;
                    yj.b.a(r10, th2);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    c08281 = this;
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                e = e10;
                c08281 = this;
                if (c08281.getFile().exists()) {
                    throw e;
                }
                return c08281.serializer.getDefaultValue();
            }
        } catch (FileNotFoundException e11) {
            e = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    public final Object readDataOrHandleCorruption(rj.c<? super T> cVar) throws Throwable {
        C08291 c08291;
        ?? r10;
        Object objHandleCorruption;
        CorruptionException corruptionException;
        ?? r11;
        CorruptionException corruptionException2;
        if (cVar instanceof C08291) {
            c08291 = (C08291) cVar;
            int i10 = c08291.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c08291.label = i10 - Integer.MIN_VALUE;
            } else {
                c08291 = new C08291(this, cVar);
            }
        } else {
            c08291 = new C08291(this, cVar);
        }
        Object data = c08291.result;
        Object objF = sj.a.f();
        int i11 = c08291.label;
        if (i11 == 0) {
            kotlin.c.b(data);
            try {
                c08291.L$0 = this;
                c08291.label = 1;
                data = readData(c08291);
                return data == objF ? objF : data;
            } catch (CorruptionException e10) {
                e = e10;
                r10 = this;
                CorruptionHandler<T> corruptionHandler = r10.corruptionHandler;
                c08291.L$0 = r10;
                c08291.L$1 = e;
                c08291.label = 2;
                objHandleCorruption = corruptionHandler.handleCorruption(e, c08291);
                if (objHandleCorruption == objF) {
                    return objF;
                }
                ?? r12 = r10;
                corruptionException = e;
                data = objHandleCorruption;
                r11 = r12;
                c08291.L$0 = corruptionException;
                c08291.L$1 = data;
                c08291.label = 3;
                if (r11.writeData$datastore_core(data, c08291) == objF) {
                    return objF;
                }
                return data;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                corruptionException = (CorruptionException) c08291.L$1;
                SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) c08291.L$0;
                kotlin.c.b(data);
                r11 = singleProcessDataStore;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = c08291.L$1;
                corruptionException2 = (CorruptionException) c08291.L$0;
                try {
                    kotlin.c.b(data);
                    return obj;
                } catch (IOException e11) {
                    e = e11;
                }
            }
            mj.d.a(corruptionException2, e);
            throw corruptionException2;
        }
        r10 = (SingleProcessDataStore) c08291.L$0;
        try {
            kotlin.c.b(data);
        } catch (CorruptionException e12) {
            e = e12;
            CorruptionHandler<T> corruptionHandler2 = r10.corruptionHandler;
            c08291.L$0 = r10;
            c08291.L$1 = e;
            c08291.label = 2;
            objHandleCorruption = corruptionHandler2.handleCorruption(e, c08291);
            if (objHandleCorruption == objF) {
                return objF;
            }
            ?? r13 = r10;
            corruptionException = e;
            data = objHandleCorruption;
            r11 = r13;
            c08291.L$0 = corruptionException;
            c08291.L$1 = data;
            c08291.label = 3;
            if (r11.writeData$datastore_core(data, c08291) == objF) {
                return objF;
            }
            return data;
        }
        try {
            c08291.L$0 = corruptionException;
            c08291.L$1 = data;
            c08291.label = 3;
            if (r11.writeData$datastore_core(data, c08291) == objF) {
                return objF;
            }
            return data;
        } catch (IOException e13) {
            e = e13;
            corruptionException2 = corruptionException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object transformAndWrite(p<? super T, ? super rj.c<? super T>, ? extends Object> pVar, d dVar, rj.c<? super T> cVar) throws Throwable {
        C08301 c08301;
        Data data;
        Object obj;
        SingleProcessDataStore singleProcessDataStore;
        SingleProcessDataStore singleProcessDataStore2;
        int iHashCode;
        if (cVar instanceof C08301) {
            c08301 = (C08301) cVar;
            int i10 = c08301.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c08301.label = i10 - Integer.MIN_VALUE;
            } else {
                c08301 = new C08301(this, cVar);
            }
        } else {
            c08301 = new C08301(this, cVar);
        }
        Object obj2 = c08301.result;
        Object objF = sj.a.f();
        int i11 = c08301.label;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = c08301.L$2;
                data = (Data) c08301.L$1;
                SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) c08301.L$0;
                kotlin.c.b(obj2);
                singleProcessDataStore = singleProcessDataStore3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c08301.L$1;
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) c08301.L$0;
                kotlin.c.b(obj2);
                singleProcessDataStore2 = singleProcessDataStore4;
            }
            l<State<T>> lVar = singleProcessDataStore2.downstreamFlow;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            lVar.setValue(new Data(obj, iHashCode));
            return obj;
        }
        kotlin.c.b(obj2);
        Data data2 = (Data) this.downstreamFlow.getValue();
        data2.checkHashCode();
        Object value = data2.getValue();
        SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(pVar, value, null);
        c08301.L$0 = this;
        c08301.L$1 = data2;
        c08301.L$2 = value;
        c08301.label = 1;
        Object objG = h.g(dVar, singleProcessDataStore$transformAndWrite$newData$1, c08301);
        if (objG == objF) {
            return objF;
        }
        data = data2;
        obj2 = objG;
        obj = value;
        singleProcessDataStore = this;
        data.checkHashCode();
        if (!ck.p.e(obj, obj2)) {
            c08301.L$0 = singleProcessDataStore;
            c08301.L$1 = obj2;
            c08301.L$2 = null;
            c08301.label = 2;
            if (singleProcessDataStore.writeData$datastore_core(obj2, c08301) == objF) {
                return objF;
            }
            obj = obj2;
            singleProcessDataStore2 = singleProcessDataStore;
            l<State<T>> lVar2 = singleProcessDataStore2.downstreamFlow;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            lVar2.setValue(new Data(obj, iHashCode));
        }
        return obj;
    }

    @Override // androidx.datastore.core.DataStore
    public c<T> getData() {
        return this.data;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    public final Object writeData$datastore_core(T t10, rj.c<? super r> cVar) throws Throwable {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        ?? file;
        ?? fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        ?? r10;
        Throwable th2;
        if (cVar instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) cVar;
            int i10 = singleProcessDataStore$writeData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, cVar);
            }
        } else {
            singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, cVar);
        }
        Object obj = singleProcessDataStore$writeData$1.result;
        Object objF = sj.a.f();
        int i11 = singleProcessDataStore$writeData$1.label;
        ?? r11 = 1;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                createParentDirectories(getFile());
                file = new File(ck.p.s(getFile().getAbsolutePath(), this.SCRATCH_SUFFIX));
                try {
                    fileOutputStream = new FileOutputStream((File) file);
                    try {
                        Serializer<T> serializer = this.serializer;
                        UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream);
                        singleProcessDataStore$writeData$1.L$0 = this;
                        singleProcessDataStore$writeData$1.L$1 = file;
                        singleProcessDataStore$writeData$1.L$2 = fileOutputStream;
                        singleProcessDataStore$writeData$1.L$3 = null;
                        singleProcessDataStore$writeData$1.L$4 = fileOutputStream;
                        singleProcessDataStore$writeData$1.label = 1;
                        if (serializer.writeTo(t10, uncloseableOutputStream, singleProcessDataStore$writeData$1) == objF) {
                            return objF;
                        }
                        singleProcessDataStore = this;
                        r11 = file;
                        r10 = fileOutputStream;
                        th2 = null;
                        fileOutputStream = fileOutputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        r11 = file;
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FileOutputStream fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                th2 = (Throwable) singleProcessDataStore$writeData$1.L$3;
                fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.L$2;
                r11 = (File) singleProcessDataStore$writeData$1.L$1;
                singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                try {
                    kotlin.c.b(obj);
                    fileOutputStream = fileOutputStream;
                    r11 = r11;
                    r10 = fileOutputStream2;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        yj.b.a(fileOutputStream, th);
                        throw th5;
                    }
                }
            }
            r10.getFD().sync();
            r rVar = r.f64562a;
            yj.b.a(fileOutputStream, th2);
            if (r11.renameTo(singleProcessDataStore.getFile())) {
                return r.f64562a;
            }
            throw new IOException("Unable to rename " + r11 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e11) {
            e = e11;
            file = r11;
            if (file.exists()) {
                file.delete();
            }
            throw e;
        }
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
            } else {
                throw new IOException(ck.p.s("Unable to create parent directories of ", file));
            }
        }
    }

    public /* synthetic */ SingleProcessDataStore(a aVar, Serializer serializer, List list, CorruptionHandler corruptionHandler, l0 l0Var, int i10, i iVar) {
        this(aVar, serializer, (i10 & 4) != 0 ? s.k() : list, (i10 & 8) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i10 & 16) != 0 ? kotlinx.coroutines.d.a(w0.b().plus(j2.b(null, 1, null))) : l0Var);
    }
}
