// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;

public interface MakefileSubstitution extends PsiLanguageInjectionHost {

  @NotNull
  List<MakefileFunction> getFunctionList();

  @NotNull
  List<MakefileString> getStringList();

  @NotNull
  List<MakefileVariableUsage> getVariableUsageList();

}
