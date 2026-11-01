package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class z0 extends b {
    private static Map<Object, z0> defaultInstanceMap = new ConcurrentHashMap();
    public n3 unknownFields = n3.f18245f;
    public int memoizedSerializedSize = -1;

    public static z0 a(z0 z0Var) throws n1 {
        if (z0Var == null || z0Var.isInitialized()) {
            return z0Var;
        }
        m3 m3VarNewUninitializedMessageException = z0Var.newUninitializedMessageException();
        m3VarNewUninitializedMessageException.getClass();
        throw new n1(m3VarNewUninitializedMessageException.getMessage());
    }

    public static g1 mutableCopy(g1 g1Var) {
        a1 a1Var = (a1) g1Var;
        int i10 = a1Var.f18146c;
        return a1Var.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends z0> T parseDelimitedFrom(T t10, InputStream inputStream) throws n1 {
        return (T) a(a(t10, inputStream, h0.a()));
    }

    public static <T extends z0> T parseFrom(T t10, InputStream inputStream) throws n1 {
        w uVar;
        if (inputStream == null) {
            byte[] bArr = l1.f18233b;
            int length = bArr.length;
            uVar = new t(bArr, 0, length, false);
            try {
                uVar.d(length);
            } catch (n1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            uVar = new u(inputStream);
        }
        return (T) a(parsePartialFrom(t10, uVar, h0.a()));
    }

    public static <T extends z0> T parsePartialFrom(T t10, w wVar, h0 h0Var) throws n1 {
        T t11 = (T) t10.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        try {
            p2 p2Var = p2.f18255c;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(t11.getClass());
            x xVar = wVar.f18316d;
            if (xVar == null) {
                xVar = new x(wVar);
            }
            t2VarA.a(t11, xVar, h0Var);
            t2VarA.c(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof n1) {
                throw ((n1) e10.getCause());
            }
            throw new n1(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof n1) {
                throw ((n1) e11.getCause());
            }
            throw e11;
        }
    }

    public final <MessageType extends z0, BuilderType extends t0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(y0.NEW_BUILDER);
    }

    public Object dynamicMethod(y0 y0Var, Object obj) {
        return dynamicMethod(y0Var, obj, null);
    }

    public abstract Object dynamicMethod(y0 y0Var, Object obj, Object obj2);

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public static b1 emptyBooleanList() {
        return j.f18219d;
    }

    public static c1 emptyDoubleList() {
        return d0.f18165d;
    }

    public static f1 emptyFloatList() {
        return q0.f18260d;
    }

    public static g1 emptyIntList() {
        return a1.f18144d;
    }

    public static j1 emptyLongList() {
        return u1.f18298d;
    }

    public static <E> k1 emptyProtobufList() {
        return q2.f18263d;
    }

    public static <T extends z0> T getDefaultInstance(Class<T> cls) {
        z0 z0Var = defaultInstanceMap.get(cls);
        if (z0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                z0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (z0Var == null) {
            try {
                z0Var = (T) ((z0) x3.f18338a.allocateInstance(cls)).getDefaultInstanceForType();
                if (z0Var == null) {
                    throw new IllegalStateException();
                }
                defaultInstanceMap.put(cls, z0Var);
            } catch (Throwable th2) {
                throw new IllegalStateException(th2);
            }
        }
        return (T) z0Var;
    }

    public static final <T extends z0> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(y0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        p2 p2Var = p2.f18255c;
        p2Var.getClass();
        boolean zA = p2Var.a(t10.getClass()).a(t10);
        if (z10) {
            t10.dynamicMethod(y0.SET_MEMOIZED_IS_INITIALIZED, zA ? t10 : null);
        }
        return zA;
    }

    public static Object newMessageInfo(d2 d2Var, String str, Object[] objArr) {
        return new r2(d2Var, str, objArr);
    }

    public static <ContainingType extends d2, Type> x0 newSingularGeneratedExtension(ContainingType containingtype, Type type, d2 d2Var, e1 e1Var, int i10, j4 j4Var, Class cls) {
        return new x0(containingtype, type, d2Var, new w0(e1Var, i10, j4Var, false, false));
    }

    public static <T extends z0> void registerDefaultInstance(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(y0.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends z0, BuilderType extends t0> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.c();
        t0.a(buildertype.f18286b, messagetype);
        return buildertype;
    }

    public Object dynamicMethod(y0 y0Var) {
        return dynamicMethod(y0Var, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p2 p2Var = p2.f18255c;
        p2Var.getClass();
        return p2Var.a(getClass()).b(this, (z0) obj);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final z0 getDefaultInstanceForType() {
        return (z0) dynamicMethod(y0.GET_DEFAULT_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final m2 getParserForType() {
        return (m2) dynamicMethod(y0.GET_PARSER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            p2 p2Var = p2.f18255c;
            p2Var.getClass();
            this.memoizedSerializedSize = p2Var.a(getClass()).b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        p2 p2Var = p2.f18255c;
        p2Var.getClass();
        int iD = p2Var.a(getClass()).d(this);
        this.memoizedHashCode = iD;
        return iD;
    }

    public void makeImmutable() {
        p2 p2Var = p2.f18255c;
        p2Var.getClass();
        p2Var.a(getClass()).c(this);
    }

    public void mergeLengthDelimitedField(int i10, s sVar) {
        if (this.unknownFields == n3.f18245f) {
            this.unknownFields = new n3();
        }
        n3 n3Var = this.unknownFields;
        if (!n3Var.f18250e) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        n3Var.a((i10 << 3) | 2, sVar);
    }

    public final void mergeUnknownFields(n3 n3Var) {
        this.unknownFields = n3.a(this.unknownFields, n3Var);
    }

    public void mergeVarintField(int i10, int i11) {
        if (this.unknownFields == n3.f18245f) {
            this.unknownFields = new n3();
        }
        n3 n3Var = this.unknownFields;
        if (!n3Var.f18250e) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        n3Var.a(i10 << 3, Long.valueOf(i11));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public final t0 newBuilderForType() {
        return (t0) dynamicMethod(y0.NEW_BUILDER);
    }

    public boolean parseUnknownField(int i10, w wVar) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == n3.f18245f) {
            this.unknownFields = new n3();
        }
        return this.unknownFields.a(i10, wVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b
    public void setMemoizedSerializedSize(int i10) {
        this.memoizedSerializedSize = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public final t0 toBuilder() {
        t0 t0Var = (t0) dynamicMethod(y0.NEW_BUILDER);
        t0Var.c();
        t0.a(t0Var.f18286b, this);
        return t0Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public void writeTo(b0 b0Var) throws IOException {
        p2 p2Var = p2.f18255c;
        p2Var.getClass();
        t2 t2VarA = p2Var.a(getClass());
        c0 c0Var = b0Var.f18153a;
        if (c0Var == null) {
            c0Var = new c0(b0Var);
        }
        t2VarA.a((Object) this, c0Var);
    }

    public static x0 access$000(e0 e0Var) {
        e0Var.getClass();
        return (x0) e0Var;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static <ContainingType extends d2, Type> x0 newRepeatedGeneratedExtension(ContainingType containingtype, d2 d2Var, e1 e1Var, int i10, j4 j4Var, boolean z10, Class cls) {
        return new x0(containingtype, Collections.emptyList(), d2Var, new w0(e1Var, i10, j4Var, true, z10));
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        f2.a(this, sb2, 0);
        return sb2.toString();
    }

    public static j1 mutableCopy(j1 j1Var) {
        u1 u1Var = (u1) j1Var;
        int i10 = u1Var.f18300c;
        return u1Var.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends z0> T parseDelimitedFrom(T t10, InputStream inputStream, h0 h0Var) throws n1 {
        return (T) a(a(t10, inputStream, h0Var));
    }

    public static z0 a(z0 z0Var, InputStream inputStream, h0 h0Var) throws n1 {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            if ((i10 & 128) != 0) {
                i10 &= 127;
                int i11 = 7;
                while (i11 < 32) {
                    int i12 = inputStream.read();
                    if (i12 == -1) {
                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    i10 |= (i12 & 127) << i11;
                    if ((i12 & 128) != 0) {
                        i11 += 7;
                    }
                }
                while (i11 < 64) {
                    int i13 = inputStream.read();
                    if (i13 == -1) {
                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    if ((i13 & 128) != 0) {
                        i11 += 7;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            u uVar = new u(new a(inputStream, i10));
            z0 partialFrom = parsePartialFrom(z0Var, uVar, h0Var);
            uVar.a(0);
            return partialFrom;
        } catch (IOException e10) {
            throw new n1(e10.getMessage());
        }
    }

    public static f1 mutableCopy(f1 f1Var) {
        q0 q0Var = (q0) f1Var;
        int i10 = q0Var.f18262c;
        return q0Var.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static c1 mutableCopy(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        int i10 = d0Var.f18167c;
        return d0Var.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends z0> T parseFrom(T t10, InputStream inputStream, h0 h0Var) throws n1 {
        w uVar;
        if (inputStream == null) {
            byte[] bArr = l1.f18233b;
            int length = bArr.length;
            uVar = new t(bArr, 0, length, false);
            try {
                uVar.d(length);
            } catch (n1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            uVar = new u(inputStream);
        }
        return (T) a(parsePartialFrom(t10, uVar, h0Var));
    }

    public static b1 mutableCopy(b1 b1Var) {
        j jVar = (j) b1Var;
        int i10 = jVar.f18221c;
        return jVar.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends z0> T parsePartialFrom(T t10, byte[] bArr, int i10, int i11, h0 h0Var) throws n1 {
        T t11 = (T) t10.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        try {
            p2 p2Var = p2.f18255c;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(t11.getClass());
            t2VarA.a(t11, bArr, i10, i10 + i11, new f(h0Var));
            t2VarA.c(t11);
            if (t11.memoizedHashCode == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof n1) {
                throw ((n1) e10.getCause());
            }
            throw new n1(e10.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static <E> k1 mutableCopy(k1 k1Var) {
        int size = k1Var.size();
        return k1Var.b(size == 0 ? 10 : size * 2);
    }

    public static <T extends z0> T parseFrom(T t10, ByteBuffer byteBuffer, h0 h0Var) throws n1 {
        t tVar;
        w vVar;
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            int iRemaining = byteBuffer.remaining();
            tVar = new t(bArrArray, iPosition, iRemaining, false);
            try {
                tVar.d(iRemaining);
            } catch (n1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (byteBuffer.isDirect() && x3.f18341d) {
                vVar = new v(byteBuffer, false);
            } else {
                int iRemaining2 = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining2];
                byteBuffer.duplicate().get(bArr);
                t tVar2 = new t(bArr, 0, iRemaining2, true);
                try {
                    tVar2.d(iRemaining2);
                    tVar = tVar2;
                } catch (n1 e11) {
                    throw new IllegalArgumentException(e11);
                }
            }
            return (T) a(parseFrom(t10, vVar, h0Var));
        }
        vVar = tVar;
        return (T) a(parseFrom(t10, vVar, h0Var));
    }

    public static <T extends z0> T parsePartialFrom(T t10, w wVar) throws n1 {
        return (T) parsePartialFrom(t10, wVar, h0.a());
    }

    public static <T extends z0> T parseFrom(T t10, ByteBuffer byteBuffer) throws n1 {
        return (T) parseFrom(t10, byteBuffer, h0.a());
    }

    public static <T extends z0> T parseFrom(T t10, s sVar) throws n1 {
        return (T) a(parseFrom(t10, sVar, h0.a()));
    }

    public static <T extends z0> T parseFrom(T t10, s sVar, h0 h0Var) throws n1 {
        w wVarD = sVar.d();
        z0 partialFrom = parsePartialFrom(t10, wVarD, h0Var);
        wVarD.a(0);
        return (T) a(partialFrom);
    }

    public static <T extends z0> T parseFrom(T t10, byte[] bArr) throws n1 {
        return (T) a(parsePartialFrom(t10, bArr, 0, bArr.length, h0.a()));
    }

    public static <T extends z0> T parseFrom(T t10, byte[] bArr, h0 h0Var) throws n1 {
        return (T) a(parsePartialFrom(t10, bArr, 0, bArr.length, h0Var));
    }

    public static <T extends z0> T parseFrom(T t10, w wVar) throws n1 {
        return (T) parseFrom(t10, wVar, h0.a());
    }

    public static <T extends z0> T parseFrom(T t10, w wVar, h0 h0Var) throws n1 {
        return (T) a(parsePartialFrom(t10, wVar, h0Var));
    }
}
