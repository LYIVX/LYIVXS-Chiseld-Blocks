package net.lyivx.lschiseld.procedures;

import net.minecraft.world.entity.Entity;

import java.util.HashMap;

public class RecipeCallerProcedure {
	public static void execute(double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		OakLogRecipeProcedure.execute(entity, guistate);
		SpruceLogRecipeProcedure.execute(entity, guistate);
		BirchLogRecipeProcedure.execute(entity, guistate);
		JungleLogRecipeProcedure.execute(entity, guistate);
		AcaciaLogRecipeProcedure.execute(entity, guistate);
		DarkOakLogRecipeProcedure.execute(entity, guistate);
		MangroveLogRecipeProcedure.execute(entity, guistate);
		CherryLogRecipeProcedure.execute(entity, guistate);
		BambooBlockRecipeProcedure.execute(entity, guistate);
		CrimsonStemRecipeProcedure.execute(entity, guistate);
		WarpedStemRecipeProcedure.execute(entity, guistate);
		OakLeavesRecipeProcedure.execute(entity);
		SpruceLeavesRecipeProcedure.execute(entity);
		BirchLeavesRecipeProcedure.execute(entity);
		JungleLeavesRecipeProcedure.execute(entity);
		AcaciaLeavesRecipeProcedure.execute(entity);
		DarkOakLeavesRecipeProcedure.execute(entity);
		MangroveLeavesRecipeProcedure.execute(entity);
		CherryLeavesRecipeProcedure.execute(entity);
	}
}
