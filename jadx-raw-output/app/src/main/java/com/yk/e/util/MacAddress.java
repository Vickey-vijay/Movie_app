package com.yk.e.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class MacAddress {
    private static InetAddress getLocalInetAddress() {
        InetAddress inetAddress;
        SocketException e10;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            inetAddress = null;
            do {
                try {
                    if (!networkInterfaces.hasMoreElements()) {
                        break;
                    }
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        try {
                            if (!inetAddressNextElement.isLoopbackAddress() && inetAddressNextElement.getHostAddress().indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER) == -1) {
                                inetAddress = inetAddressNextElement;
                                break;
                            }
                            inetAddress = null;
                        } catch (SocketException e11) {
                            e10 = e11;
                            inetAddress = inetAddressNextElement;
                            e10.printStackTrace();
                        }
                    }
                } catch (SocketException e12) {
                    e10 = e12;
                }
            } while (inetAddress == null);
        } catch (SocketException e13) {
            inetAddress = null;
            e10 = e13;
        }
        return inetAddress;
    }

    private static String getMacAdd(Context context) {
        String strTrim;
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("cat /sys/class/net/wlan0/address").getInputStream()));
            String line = "";
            while (true) {
                if (line != null) {
                    line = lineNumberReader.readLine();
                    if (line != null) {
                        strTrim = line.trim();
                        break;
                    }
                    strTrim = "";
                    break;
                }
                strTrim = "";
                break;
            }
        } catch (Exception e10) {
            Log.e("----->NetInfoManager", "getMacAddress:" + e10.toString());
        }
        if (strTrim == null || "".equals(strTrim)) {
            try {
                return loadFileAsString("/sys/class/net/eth0/address").toUpperCase().substring(0, 17);
            } catch (Exception e11) {
                e11.printStackTrace();
                Log.e("----->NetInfoManager", "getMacAddress:" + e11.toString());
            }
        }
        return strTrim;
    }

    private static String getMachineHardwareAddress() {
        Enumeration<NetworkInterface> networkInterfaces;
        String strBytesToString = null;
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e10) {
            e10.printStackTrace();
            networkInterfaces = null;
        }
        if (networkInterfaces == null) {
            return null;
        }
        while (networkInterfaces.hasMoreElements()) {
            try {
                strBytesToString = bytesToString(networkInterfaces.nextElement().getHardwareAddress());
                if (strBytesToString != null) {
                    break;
                }
            } catch (SocketException e11) {
                e11.printStackTrace();
            }
        }
        return strBytesToString;
    }

    private static String bytesToString(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02X:", Byte.valueOf(b10)));
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private static String callCmd(String str, String str2) {
        String str3 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null || line.contains(str2)) {
                    return line;
                }
                str3 = str3 + line;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static String getLocalMacAddressFromBusybox() {
        String strCallCmd = callCmd("busybox ifconfig", "HWaddr");
        if (strCallCmd == null) {
            return "网络异常";
        }
        return (strCallCmd.length() <= 0 || !strCallCmd.contains("HWaddr")) ? strCallCmd : strCallCmd.substring(strCallCmd.indexOf("HWaddr") + 6, strCallCmd.length() - 1);
    }

    private static String getLocalMacAddressFromWifiInfo(Context context) {
        return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
    }

    public static String getMacAddress(Context context) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            NetworkInterface byName = NetworkInterface.getByName("eth1");
            if (byName == null) {
                byName = NetworkInterface.getByName("wlan0");
            }
            if (byName == null) {
                return getMac(context);
            }
            for (byte b10 : byName.getHardwareAddress()) {
                stringBuffer.append(String.format("%02X:", Byte.valueOf(b10)));
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "02:00:00:00:00:00";
        }
    }

    private static boolean isAccessWifiStateAuthorized(Context context) {
        return context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }

    private static String loadFileAsString(String str) throws Exception {
        FileReader fileReader = new FileReader(str);
        String strLoadReaderAsString = loadReaderAsString(fileReader);
        fileReader.close();
        return strLoadReaderAsString;
    }

    private static String loadReaderAsString(Reader reader) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        char[] cArr = new char[4096];
        while (true) {
            int i10 = reader.read(cArr);
            if (i10 < 0) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, i10);
        }
    }

    private static String getMac(Context context) {
        if (!TextUtils.isEmpty(getMacAdd())) {
            return getMacAdd();
        }
        if (!TextUtils.isEmpty(getMachineHardwareAddress())) {
            return getMachineHardwareAddress();
        }
        return getLocalMacAddressFromBusybox();
    }

    @SuppressLint({"MissingPermission"})
    private static String getMacAddress0(Context context) {
        if (isAccessWifiStateAuthorized(context)) {
            try {
                return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            } catch (Exception e10) {
                Log.e("----->NetInfoManager", "getMacAddress0:" + e10.toString());
                return "";
            }
        }
        return "";
    }

    private static String getMacAdd() {
        try {
            byte[] hardwareAddress = NetworkInterface.getByInetAddress(getLocalInetAddress()).getHardwareAddress();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < hardwareAddress.length; i10++) {
                if (i10 != 0) {
                    stringBuffer.append(':');
                }
                String hexString = Integer.toHexString(hardwareAddress[i10] & 255);
                if (hexString.length() == 1) {
                    hexString = 0 + hexString;
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString().toUpperCase();
        } catch (Exception unused) {
            return null;
        }
    }
}
