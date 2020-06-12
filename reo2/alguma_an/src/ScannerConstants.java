public interface ScannerConstants {
    int[] SCANNER_TABLE_INDEXES = { 0, 60, 60, 60, 60, 60, 71, 71, 73, 73, 74, 76, 77, 78, 79, 81, 82, 83, 84, 85, 147,
            148, 158, 159, 160, 161, 163, 164, 165, 167, 168, 168, 169, 169, 231, 232, 242, 243, 244, 245, 246, 247,
            247, 248, 249, 250, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 260, 261, 262, 263, 264, 265,
            265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 274, 275, 276, 277, 278, 279, 280, 281, 281, 282, 283,
            283, 284, 284, 284, 284, 284, 285, 286, 286 };

    int[][] SCANNER_TABLE = { { 9, 1 }, { 10, 1 }, { 13, 1 }, { 32, 1 }, { 40, 2 }, { 41, 3 }, { 42, 4 }, { 43, 4 },
            { 45, 4 }, { 47, 4 }, { 48, 5 }, { 49, 5 }, { 50, 5 }, { 51, 5 }, { 52, 5 }, { 53, 5 }, { 54, 5 },
            { 55, 5 }, { 56, 5 }, { 57, 5 }, { 58, 6 }, { 60, 7 }, { 61, 8 }, { 62, 9 }, { 65, 10 }, { 68, 11 },
            { 69, 12 }, { 70, 13 }, { 73, 14 }, { 76, 15 }, { 79, 16 }, { 82, 17 }, { 83, 18 }, { 97, 19 }, { 98, 19 },
            { 99, 19 }, { 100, 19 }, { 101, 19 }, { 102, 19 }, { 103, 19 }, { 104, 19 }, { 105, 19 }, { 106, 19 },
            { 107, 19 }, { 108, 19 }, { 109, 19 }, { 110, 19 }, { 111, 19 }, { 112, 19 }, { 113, 19 }, { 114, 19 },
            { 115, 19 }, { 116, 19 }, { 117, 19 }, { 118, 19 }, { 119, 19 }, { 120, 19 }, { 121, 19 }, { 122, 19 },
            { 123, 20 }, { 44, 21 }, { 48, 5 }, { 49, 5 }, { 50, 5 }, { 51, 5 }, { 52, 5 }, { 53, 5 }, { 54, 5 },
            { 55, 5 }, { 56, 5 }, { 57, 5 }, { 61, 8 }, { 62, 8 }, { 61, 8 }, { 76, 22 }, { 84, 23 }, { 69, 24 },
            { 78, 25 }, { 73, 26 }, { 77, 27 }, { 78, 28 }, { 69, 29 }, { 85, 30 }, { 69, 31 }, { 69, 32 }, { 48, 33 },
            { 49, 33 }, { 50, 33 }, { 51, 33 }, { 52, 33 }, { 53, 33 }, { 54, 33 }, { 55, 33 }, { 56, 33 }, { 57, 33 },
            { 65, 33 }, { 66, 33 }, { 67, 33 }, { 68, 33 }, { 69, 33 }, { 70, 33 }, { 71, 33 }, { 72, 33 }, { 73, 33 },
            { 74, 33 }, { 75, 33 }, { 76, 33 }, { 77, 33 }, { 78, 33 }, { 79, 33 }, { 80, 33 }, { 81, 33 }, { 82, 33 },
            { 83, 33 }, { 84, 33 }, { 85, 33 }, { 86, 33 }, { 87, 33 }, { 88, 33 }, { 89, 33 }, { 90, 33 }, { 97, 19 },
            { 98, 19 }, { 99, 19 }, { 100, 19 }, { 101, 19 }, { 102, 19 }, { 103, 19 }, { 104, 19 }, { 105, 19 },
            { 106, 19 }, { 107, 19 }, { 108, 19 }, { 109, 19 }, { 110, 19 }, { 111, 19 }, { 112, 19 }, { 113, 19 },
            { 114, 19 }, { 115, 19 }, { 116, 19 }, { 117, 19 }, { 118, 19 }, { 119, 19 }, { 120, 19 }, { 121, 19 },
            { 122, 19 }, { 108, 34 }, { 48, 35 }, { 49, 35 }, { 50, 35 }, { 51, 35 }, { 52, 35 }, { 53, 35 },
            { 54, 35 }, { 55, 35 }, { 56, 35 }, { 57, 35 }, { 71, 36 }, { 82, 37 }, { 67, 38 }, { 81, 39 }, { 84, 40 },
            { 77, 41 }, { 80, 42 }, { 73, 43 }, { 84, 44 }, { 82, 45 }, { 65, 46 }, { 48, 33 }, { 49, 33 }, { 50, 33 },
            { 51, 33 }, { 52, 33 }, { 53, 33 }, { 54, 33 }, { 55, 33 }, { 56, 33 }, { 57, 33 }, { 65, 33 }, { 66, 33 },
            { 67, 33 }, { 68, 33 }, { 69, 33 }, { 70, 33 }, { 71, 33 }, { 72, 33 }, { 73, 33 }, { 74, 33 }, { 75, 33 },
            { 76, 33 }, { 77, 33 }, { 78, 33 }, { 79, 33 }, { 80, 33 }, { 81, 33 }, { 82, 33 }, { 83, 33 }, { 84, 33 },
            { 85, 33 }, { 86, 33 }, { 87, 33 }, { 88, 33 }, { 89, 33 }, { 90, 33 }, { 97, 33 }, { 98, 33 }, { 99, 33 },
            { 100, 33 }, { 101, 33 }, { 102, 33 }, { 103, 33 }, { 104, 33 }, { 105, 33 }, { 106, 33 }, { 107, 33 },
            { 108, 33 }, { 109, 33 }, { 110, 33 }, { 111, 33 }, { 112, 33 }, { 113, 33 }, { 114, 33 }, { 115, 33 },
            { 116, 33 }, { 117, 33 }, { 118, 33 }, { 119, 33 }, { 120, 33 }, { 121, 33 }, { 122, 33 }, { 101, 47 },
            { 48, 35 }, { 49, 35 }, { 50, 35 }, { 51, 35 }, { 52, 35 }, { 53, 35 }, { 54, 35 }, { 55, 35 }, { 56, 35 },
            { 57, 35 }, { 79, 48 }, { 73, 49 }, { 76, 50 }, { 85, 51 }, { 65, 52 }, { 82, 53 }, { 67, 54 }, { 69, 55 },
            { 76, 56 }, { 116, 57 }, { 82, 58 }, { 66, 59 }, { 65, 60 }, { 65, 61 }, { 79, 62 }, { 73, 63 }, { 73, 64 },
            { 73, 65 }, { 114, 66 }, { 73, 67 }, { 85, 68 }, { 82, 69 }, { 78, 70 }, { 77, 71 }, { 79, 72 }, { 82, 73 },
            { 97, 74 }, { 84, 75 }, { 73, 76 }, { 65, 77 }, { 84, 78 }, { 73, 79 }, { 79, 80 }, { 115, 81 }, { 77, 82 },
            { 82, 83 }, { 67, 84 }, { 79, 85 }, { 82, 86 }, { 125, 87 }, { 79, 88 }, { 79, 89 }, { 69, 90 },
            { 83, 91 } };

    int[] TOKEN_STATE = { 16, 0, 23, 24, 15, 20, 18, 16, 16, 16, 4, -1, 17, -1, -1, -1, -1, -1, -1, 19, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, 17, -1, 11, 19, -1, 21, -1, -1, -1, -1, -1, 3, -1, -1, -1, 9, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, 7, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, -1,
            -1, -1, 6, -1, -1, 8, -1, 13, 10, 22, 5, -1, -1, 2 };

    String[] SCANNER_ERROR = { "Caractere não esperado", "", "", "", "", "", "", "", "", "", "",
            "Erro identificando DEC", "", "Erro identificando FIM", "Erro identificando INT ou IMP ou INI",
            "Erro identificando LER", "Erro identificando OpBool", "Erro identificando REA", "Erro identificando SE",
            "", "Erro identificando Str", "Erro identificando NumR", "Erro identificando ALG", "Erro identificando ATR",
            "Erro identificando DEC", "Erro identificando ENT ou ENQ", "Erro identificando FIM",
            "Erro identificando IMP", "Erro identificando INT ou INI", "Erro identificando LER", "",
            "Erro identificando REA", "", "", "Erro identificando Str", "", "Erro identificando ALG",
            "Erro identificando ATR", "Erro identificando DEC", "Erro identificando ENQ", "Erro identificando ENT", "",
            "Erro identificando IMP", "Erro identificando INI", "Erro identificando INT", "", "Erro identificando REA",
            "Erro identificando Str", "Erro identificando ALG", "Erro identificando ATR", "Erro identificando DEC",
            "Erro identificando ENQ", "Erro identificando ENT", "Erro identificando IMP", "Erro identificando INI",
            "Erro identificando INT", "", "Erro identificando Str", "Erro identificando ALG", "Erro identificando ATR",
            "Erro identificando DEC", "Erro identificando ENQ", "", "Erro identificando IMP", "Erro identificando INI",
            "Erro identificando INT", "Erro identificando Str", "Erro identificando ALG", "Erro identificando ATR",
            "Erro identificando DEC", "Erro identificando ENQ", "Erro identificando IMP", "", "Erro identificando INT",
            "Erro identificando Str", "Erro identificando ALG", "Erro identificando ATR", "Erro identificando DEC",
            "Erro identificando ENQ", "Erro identificando IMP", "", "Erro identificando Str", "Erro identificando ALG",
            "", "Erro identificando DEC", "", "", "", "", "Erro identificando DEC", "Erro identificando DEC", "" };

}
