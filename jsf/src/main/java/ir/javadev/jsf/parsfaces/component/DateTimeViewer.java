package ir.javadev.jsf.parsfaces.component;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@FacesComponent(value = "component.DateTimeViewer")
public class DateTimeViewer extends UIOutput {
    @Override
    public String getFamily() {
        return "DateTimeViewer";
    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        // super.encodeBegin(context);
        String message = (String) getAttributes().get("message");
        LocalDateTime time = (LocalDateTime) getAttributes().get("time");
        String formattedTime = time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));

        ResponseWriter writer = context.getResponseWriter();
        writer.startElement("p", this);
        writer.write("Message: " + message);
        writer.endElement("p");

        writer.startElement("p", this);
        writer.write("Time: " + formattedTime);
        writer.endElement("p");
    }
}
