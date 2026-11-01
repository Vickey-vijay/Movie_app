package org.eclipse.jetty.util.security;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import zm.b;
import zm.c;

/* JADX INFO: loaded from: classes8.dex */
public class Password extends Credential {
    public static final String __OBFUSCATE = "OBF:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f65748c = b.a(Password.class);
    private static final long serialVersionUID = 5062906681431569445L;
    private String _pw;

    public static void main(String[] strArr) {
        if (strArr.length != 1 && strArr.length != 2) {
            System.err.println("Usage - java org.eclipse.jetty.security.Password [<user>] <password>");
            System.err.println("If the password is ?, the user will be prompted for the password");
            System.exit(1);
        }
        String str = strArr[strArr.length == 1 ? (char) 0 : (char) 1];
        Password password = new Password(str);
        System.err.println(password.toString());
        System.err.println(obfuscate(password.toString()));
        System.err.println(Credential.MD5.digest(str));
        if (strArr.length == 2) {
            System.err.println(Credential.Crypt.crypt(strArr[0], password.toString()));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Password)) {
            if (obj instanceof String) {
                return obj.equals(this._pw);
            }
            return false;
        }
        Object obj2 = ((Password) obj)._pw;
        String str = this._pw;
        if (obj2 != str) {
            return str != null && str.equals(obj2);
        }
        return true;
    }

    public static String deobfuscate(String str) {
        if (str.startsWith(__OBFUSCATE)) {
            str = str.substring(4);
        }
        byte[] bArr = new byte[str.length() / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i10 + 4;
            int i13 = Integer.parseInt(str.substring(i10, i12), 36);
            bArr[i11] = (byte) ((((i13 / 256) + (i13 % 256)) - 254) / 2);
            i10 = i12;
            i11++;
        }
        return new String(bArr, 0, i11);
    }

    public static String obfuscate(String str) {
        StringBuilder sb2 = new StringBuilder();
        byte[] bytes = str.getBytes();
        sb2.append(__OBFUSCATE);
        int i10 = 0;
        while (i10 < bytes.length) {
            byte b10 = bytes[i10];
            i10++;
            byte b11 = bytes[str.length() - i10];
            int i11 = b10 + 127;
            String string = Integer.toString(((i11 + b11) * 256) + (i11 - b11), 36);
            int length = string.length();
            if (length == 1) {
                sb2.append('0');
                sb2.append('0');
                sb2.append('0');
                sb2.append(string);
            } else if (length == 2) {
                sb2.append('0');
                sb2.append('0');
                sb2.append(string);
            } else if (length != 3) {
                sb2.append(string);
            } else {
                sb2.append('0');
                sb2.append(string);
            }
        }
        return sb2.toString();
    }

    @Override // org.eclipse.jetty.util.security.Credential
    public boolean check(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Password) {
            return obj.equals(this._pw);
        }
        if (obj instanceof String) {
            return obj.equals(this._pw);
        }
        if (obj instanceof char[]) {
            return Arrays.equals(this._pw.toCharArray(), (char[]) obj);
        }
        if (obj instanceof Credential) {
            return ((Credential) obj).check(this._pw);
        }
        return false;
    }

    public int hashCode() {
        String str = this._pw;
        return str == null ? super.hashCode() : str.hashCode();
    }

    public String toStarString() {
        return "*****************************************************".substring(0, this._pw.length());
    }

    public String toString() {
        return this._pw;
    }

    public Password(String str) {
        this._pw = str;
        while (true) {
            String str2 = this._pw;
            if (str2 != null && str2.startsWith(__OBFUSCATE)) {
                this._pw = deobfuscate(this._pw);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d A[PHI: r4
  0x000d: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v1 java.lang.String) binds: [B:22:0x0060, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    public static Password getPassword(String str, String str2, String str3) {
        String str4;
        String property = System.getProperty(str, str2);
        if (property != null && property.length() != 0) {
            str3 = property;
        } else {
            try {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                if (str3 != null && str3.length() > 0) {
                    str4 = " [dft]";
                } else {
                    str4 = "";
                }
                sb2.append(str4);
                sb2.append(" : ");
                printStream.print(sb2.toString());
                System.out.flush();
                byte[] bArr = new byte[512];
                int i10 = System.in.read(bArr);
                if (i10 > 0) {
                    property = new String(bArr, 0, i10).trim();
                }
            } catch (IOException e10) {
                f65748c.c("EXCEPTION ", e10);
            }
            if (property != null && property.length() != 0) {
                str3 = property;
            }
        }
        return new Password(str3);
    }
}
