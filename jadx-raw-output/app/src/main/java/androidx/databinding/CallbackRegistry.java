package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {
    private static final String TAG = "CallbackRegistry";
    private List<C> mCallbacks = new ArrayList();
    private long mFirst64Removed = 0;
    private int mNotificationLevel;
    private final NotifierCallback<C, T, A> mNotifier;
    private long[] mRemainderRemoved;

    public static abstract class NotifierCallback<C, T, A> {
        public abstract void onNotifyCallback(C c10, T t10, int i10, A a10);
    }

    public synchronized void add(C c10) {
        try {
            if (c10 == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.mCallbacks.lastIndexOf(c10);
            if (iLastIndexOf < 0 || isRemoved(iLastIndexOf)) {
                this.mCallbacks.add(c10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void clear() {
        if (this.mNotificationLevel == 0) {
            this.mCallbacks.clear();
        } else if (!this.mCallbacks.isEmpty()) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                setRemovalBit(size);
            }
        }
    }

    public synchronized ArrayList<C> copyCallbacks() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.mCallbacks.size());
        int size = this.mCallbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!isRemoved(i10)) {
                arrayList.add(this.mCallbacks.get(i10));
            }
        }
        return arrayList;
    }

    public synchronized boolean isEmpty() {
        if (this.mCallbacks.isEmpty()) {
            return true;
        }
        if (this.mNotificationLevel == 0) {
            return false;
        }
        int size = this.mCallbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!isRemoved(i10)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T t10, int i10, A a10) {
        this.mNotificationLevel++;
        notifyRecurse(t10, i10, a10);
        int i11 = this.mNotificationLevel - 1;
        this.mNotificationLevel = i11;
        if (i11 == 0) {
            long[] jArr = this.mRemainderRemoved;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j10 = this.mRemainderRemoved[length];
                    if (j10 != 0) {
                        removeRemovedCallbacks((length + 1) * 64, j10);
                        this.mRemainderRemoved[length] = 0;
                    }
                }
            }
            long j11 = this.mFirst64Removed;
            if (j11 != 0) {
                removeRemovedCallbacks(0, j11);
                this.mFirst64Removed = 0L;
            }
        }
    }

    public synchronized void remove(C c10) {
        if (this.mNotificationLevel == 0) {
            this.mCallbacks.remove(c10);
        } else {
            int iLastIndexOf = this.mCallbacks.lastIndexOf(c10);
            if (iLastIndexOf >= 0) {
                setRemovalBit(iLastIndexOf);
            }
        }
    }

    private boolean isRemoved(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.mFirst64Removed) != 0;
        }
        long[] jArr = this.mRemainderRemoved;
        if (jArr != null && (i11 = (i10 / 64) - 1) < jArr.length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    private void notifyFirst64(T t10, int i10, A a10) {
        notifyCallbacks(t10, i10, a10, 0, Math.min(64, this.mCallbacks.size()), this.mFirst64Removed);
    }

    private void notifyRecurse(T t10, int i10, A a10) {
        int size = this.mCallbacks.size();
        long[] jArr = this.mRemainderRemoved;
        int length = jArr == null ? -1 : jArr.length - 1;
        notifyRemainder(t10, i10, a10, length);
        notifyCallbacks(t10, i10, a10, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainder(T t10, int i10, A a10, int i11) {
        if (i11 < 0) {
            notifyFirst64(t10, i10, a10);
            return;
        }
        long j10 = this.mRemainderRemoved[i11];
        int i12 = (i11 + 1) * 64;
        int iMin = Math.min(this.mCallbacks.size(), i12 + 64);
        notifyRemainder(t10, i10, a10, i11 - 1);
        notifyCallbacks(t10, i10, a10, i12, iMin, j10);
    }

    private void removeRemovedCallbacks(int i10, long j10) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = (i10 + 64) - 1; i11 >= i10; i11--) {
            if ((j10 & j11) != 0) {
                this.mCallbacks.remove(i11);
            }
            j11 >>>= 1;
        }
    }

    private void setRemovalBit(int i10) {
        if (i10 < 64) {
            this.mFirst64Removed = (1 << i10) | this.mFirst64Removed;
            return;
        }
        int i11 = (i10 / 64) - 1;
        long[] jArr = this.mRemainderRemoved;
        if (jArr == null) {
            this.mRemainderRemoved = new long[this.mCallbacks.size() / 64];
        } else if (jArr.length <= i11) {
            long[] jArr2 = new long[this.mCallbacks.size() / 64];
            long[] jArr3 = this.mRemainderRemoved;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.mRemainderRemoved = jArr2;
        }
        long j10 = 1 << (i10 % 64);
        long[] jArr4 = this.mRemainderRemoved;
        jArr4[i11] = j10 | jArr4[i11];
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized CallbackRegistry<C, T, A> m8clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        CloneNotSupportedException e10;
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
            try {
                callbackRegistry.mFirst64Removed = 0L;
                callbackRegistry.mRemainderRemoved = null;
                callbackRegistry.mNotificationLevel = 0;
                callbackRegistry.mCallbacks = new ArrayList();
                int size = this.mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!isRemoved(i10)) {
                        callbackRegistry.mCallbacks.add(this.mCallbacks.get(i10));
                    }
                }
            } catch (CloneNotSupportedException e11) {
                e10 = e11;
                e10.printStackTrace();
            }
        } catch (CloneNotSupportedException e12) {
            callbackRegistry = null;
            e10 = e12;
        }
        return callbackRegistry;
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        this.mNotifier = notifierCallback;
    }

    public synchronized void copyCallbacks(List<C> list) {
        list.clear();
        int size = this.mCallbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!isRemoved(i10)) {
                list.add(this.mCallbacks.get(i10));
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void notifyCallbacks(T t10, int i10, A a10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.mNotifier.onNotifyCallback(this.mCallbacks.get(i11), t10, i10, a10);
            }
            j11 <<= 1;
            i11++;
        }
    }
}
