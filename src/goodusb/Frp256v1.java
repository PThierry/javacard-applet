package goodusb;

public class Frp256v1 {
	/* FRP256V1 parameters */
        byte[] p = {
                (byte)0xf1, (byte)0xfd, 0x17, (byte)0x8c, 0x0b, 0x3a, (byte)0xd5, (byte)0x8f, 0x10, 0x12, 0x6d, (byte)0xe8, (byte)0xce, 0x42, 0x43, 0x5b, 0x39, 0x61, (byte)0xad, (byte)0xbc, (byte)0xab, (byte)0xc8, (byte)0xca, 0x6d, (byte) 0xe8, (byte)0xfc, (byte)0xf3, 0x53, (byte)0xd8, 0x6e, (byte) 0x9c, (byte) 0x03
        };

        byte[] a = {
                (byte)0xf1, (byte)0xfd, 0x17, (byte)0x8c, 0x0b, 0x3a, (byte)0xd5, (byte)0x8f, 0x10, 0x12, 0x6d, (byte)0xe8, (byte)0xce, 0x42, 0x43, 0x5b, 0x39, 0x61, (byte)0xad, (byte)0xbc, (byte)0xab, (byte)0xc8, (byte)0xca, 0x6d, (byte) 0xe8, (byte)0xfc, (byte)0xf3, 0x53, (byte)0xd8, 0x6e, (byte)0x9c, 0x00
        };

        byte[] b = {
                (byte)0xee, 0x35, 0x3f, (byte)0xca, 0x54, 0x28, (byte)0xa9, 0x30, 0x0d, 0x4a, (byte)0xba, 0x75, 0x4a, 0x44, (byte)0xc0, 0x0f, (byte)0xdf, (byte) 0xec, 0x0c, (byte)0x9a, (byte) 0xe4, (byte)0xb1, (byte)0xa1, (byte)0x80, 0x30, 0x75, (byte) 0xed, (byte)0x96, 0x7b, 0x7b, (byte)0xb7, 0x3f
        };

        byte[] G = {
                (byte)0x04, (byte)0xb6, (byte)0xb3, (byte)0xd4, (byte)0xc3, 0x56, (byte)0xc1, 0x39, (byte)0xeb, 0x31, 0x18, 0x3d, 0x47, 0x49, (byte)0xd4, 0x23, (byte)0x95, (byte)0x8c, 0x27, (byte)0xd2, (byte)0xdc, (byte)0xaf, (byte)0x98, (byte)0xb7, 0x01, 0x64, (byte)0xc9, 0x7a, 0x2d, (byte)0xd9, (byte)0x8f, 0x5c, (byte)0xff, 0x61, 0x42, (byte) 0xe0, (byte)0xf7, (byte)0xc8, (byte)0xb2, 0x04, (byte)0x91, 0x1f, (byte)0x92, 0x71, (byte)0xf0, (byte)0xf3, (byte) 0xec,
(byte) 0xef, (byte)0x8c, 0x27, 0x01, (byte)0xc3, 0x07, (byte) 0xe8, (byte) 0xe4, (byte)0xc9, (byte) 0xe1, (byte)0x83, 0x11, 0x5a, 0x15, 0x54, 0x06, 0x2c, (byte)0xfb
        };

        byte[] q = {
                (byte) 0xf1, (byte) 0xfd, (byte) 0x17, (byte) 0x8c, (byte) 0x0b, (byte) 0x3a, (byte) 0xd5, (byte) 0x8f,
                (byte) 0x10, (byte) 0x12, (byte) 0x6d, (byte) 0xe8, (byte) 0xce, (byte) 0x42, (byte) 0x43, (byte) 0x5b,
                (byte) 0x53, (byte) 0xdc, (byte) 0x67, (byte) 0xe1, (byte) 0x40, (byte) 0xd2, (byte) 0xbf, (byte) 0x94,
                (byte) 0x1f, (byte) 0xfd, (byte) 0xd4, (byte) 0x59, (byte) 0xc6, (byte) 0xd6, (byte) 0x55, (byte) 0xe1
        };
        byte[] cofactor = { (byte) 0x01 };
}
