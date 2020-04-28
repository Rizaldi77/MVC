
package mvc;

public class MhsMVC {
    MhsView mhsview = new MhsView();
    MhsModel mhsmodel = new MhsModel();
    MhsDAO mhsdao = new MhsDAO();
    MhsController mhscontroller = new MhsController(mhsmodel, mhsview, mhsdao);
}
