package com.hbm.handler;

public class FluidTypeHandler {
	
	public enum FluidType {
		NONE		(0x888888, 8947848, 	0,	1, "hbmfluid.none"),
		WATER		(0x3333FF, 3355647, 	1,	1, "hbmfluid.water"),
		COOLANT		(0xd8fcff, 14220543, 	2,	1, "hbmfluid.coolant"),
		LAVA		(0xFF3300, 16724736, 	3,	1, "hbmfluid.lava"),
		DEUTERIUM	(0x0000FF, 255, 		4,	1, "hbmfluid.deuterium"),
		TRITIUM		(0x000099, 153, 		5,	1, "hbmfluid.tritium"),
		OIL			(0x020202, 131586, 		6,	1, "hbmfluid.oil"),
		SMEAR		(0x190f01, 1642241, 	7,	1, "hbmfluid.smear"),
		RECLAIMED	(0x332b22, 3353378, 	8,	1, "hbmfluid.reclaimed"),
		PETROIL		(0x44413d, 4473149, 	9,	1, "hbmfluid.petroil"),
		LUBRICANT	(0x606060, 6316128, 	10,	1, "hbmfluid.lubricant"),
		DIESEL		(0xf2eed5, 15920853, 	11,	1, "hbmfluid.diesel"),
		KEROSENE	(0xffa5d2, 16754130, 	12,	1, "hbmfluid.kerosene"),
		GAS			(0xfffeed, 16776941, 	13,	1, "hbmfluid.gas"),
		UF6			(0xD1CEBE, 13749950, 	14,	1, "hbmfluid.uf6"),
		PUF6		(0x4C4C4C, 5000268, 	15,	1, "hbmfluid.puf6"),
		AMAT		(0x010101, 65793, 		0,	2, "hbmfluid.amat"),
		ASCHRAB		(0xb50000, 11862016, 	1,	2, "hbmfluid.aschrab");

		private int color;
		private int msa;
		private int textureX;
		private int textureY;
		private String name;
		
		private FluidType(int color, int msa, int x, int y, String name) {
			this.color = color;
			this.msa = msa;
			this.textureX = x;
			this.textureY = y;
			this.name = name;
		}

		public int getColor() {
			return this.color;
		}
		public int getMSAColor() {
			return this.msa;
		}
		public int textureX() {
			return this.textureX;
		}
		public int textureY() {
			return this.textureY;
		}
		public String getUnlocalizedName() {
			return this.name;
		}
		
		public static FluidType getEnum(int i) {
			return FluidType.values()[i];
		}
		
		public String getName() {
			return this.toString();
		}
	};
	
	//More stuff to follow.

}
