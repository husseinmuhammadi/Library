package com.npci.lms.library.web.controller.document;

import com.npci.lms.library.api.DocumentService;
import com.npci.lms.library.model.to.Document;
import com.npci.lms.library.web.controller.ControllerBase;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class DocumentDownloadController extends ControllerBase implements Serializable {

    //region Constants
    private static final long serialVersionUID = 4690259483096944575L;
    //endregion Constants

    //region Service
    @EJB
    private DocumentService service;
    //endregion Service

    //region Fields
    private Document document;
    //endregion Fields

    //region Methods
    public void download() {
        /*
        try {
            Document document = service.find(1L);

            HttpServletResponse response = getHttpServletResponse();
            String fileName = "switch-transactions.xls";
            response.setContentType("application/xls");
            response.setHeader("Content-Disposition", "inline;filename=\"" + fileName + "\"");
            BufferedOutputStream output = new BufferedOutputStream(response.getOutputStream());

            HSSFWorkbook workbook = new HSSFWorkbook(); // entityAttributeReportXLS(baseValueObjectArrayList, EntityNameEn.Station, EntityAttributeGroupEn.Utility, reservedColumns);

            // Create a blank sheet
            HSSFSheet sheet = workbook.createSheet("transactions");

            int rownum = 0;


            for (MiddleEastBankSwitchTransaction transaction : inconsistentSwitchTransactions) {
                if (rownum == 0) {
                    WriteRow(sheet, rownum++, getFieldNames(transaction));
                }

                WriteRow(sheet, rownum++, getFieldValues(transaction));
            }

            // write the workbook to the output stream
            // close our file (don't blow out our file handles
            workbook.write(output);
            output.close();

            // response.flushBuffer();
            // FacesContext.getCurrentInstance().responseComplete();

        }
        */
    }
    //endregion Methods

}
