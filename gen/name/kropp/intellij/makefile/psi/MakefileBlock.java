// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MakefileBlock extends PsiElement {

  @NotNull
  List<MakefileDefine> getDefineList();

  @NotNull
  List<MakefileExport> getExportList();

  @NotNull
  List<MakefileInclude> getIncludeList();

  @NotNull
  List<MakefileOverride> getOverrideList();

  @NotNull
  List<MakefilePrivatevar> getPrivatevarList();

  @NotNull
  List<MakefileRule> getRuleList();

  @NotNull
  List<MakefileTopconditional> getTopconditionalList();

  @NotNull
  List<MakefileUndefine> getUndefineList();

  @NotNull
  List<MakefileVariableAssignment> getVariableAssignmentList();

  @NotNull
  List<MakefileVpath> getVpathList();

}
