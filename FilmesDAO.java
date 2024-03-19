
public class FilmesDAO {
    public Filmes filme;
    public BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    public static final byte INCLUSAO=1;
    public static final byte ALTERACAO=2;
    public static final byte EXCLUSAO=3;

    public FilmesDAO(){
        bd= new BD();
        filme= new Filmes();
    }
    public boolean localizar() {
        sql = "select * from films qhere codigp = ?"
    }
    try{
        statement = bd.connection.prepareStament(sql);
        statement.setString(1, filme.getCodigo());
        resultSet = statement.executeQuery();
        resultSet.next();
        filme.setCodigo(resultSet.getString(1));
        filme.setTitulo(resultSet.getString(2));
        filme.setGenero(resultSet.getString(3));
        filme.setProdutora(resultSet.getString(4));
        filme.setDataCompra("" + resultSet.getString(5));
        return true;
    } catch (SQLException erro){
        return false;
    }
}
public String atualizar (int operacao) (
        men = "Operação realizada com sucesso!";
        try
)