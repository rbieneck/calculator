import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Rechner {
	
	public static double evaluate(String string)
    {
        ScriptEngine engine =
            new ScriptEngineManager().getEngineByName("JavaScript");
        try
        {
            Object object = engine.eval("eval("+string+")");
            if ((object != null) && (object instanceof Number))
            {
                return ((Number)(object)).doubleValue();
            }
            else
            {
                throw new IllegalArgumentException(
                    "Invalid input: '"+string+"'");
            }
        }
        catch (ScriptException e)
        {
            throw new IllegalArgumentException(
                "Invalid input: '"+string+"'", e);
        }
    }
}
