package regulation.application;


public class Application {

    /*private static final SessionFactory ourSessionFactory;
    private static ArrayList<DocumentHeader> headers = new ArrayList<>();
    private static ArrayList<DocumentUpload> mocks = new ArrayList<>();
    private static ArrayList<DocumentDownload> downloads = new ArrayList<>();

    private static IOController controller = new FileController();

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    /*public static void uploadDocumentToDB(Session session, DocumentUpload doc) {

        System.out.println("Beginning upload, wait...");

        session.beginTransaction();
        session.save(doc);
        session.getTransaction().commit();

        System.out.println("Document have been uploaded!");
    }

    public static void uploadDocumentToDB(Session session, ArrayList<DocumentUpload> docs) {

        System.out.println("Beginning upload, wait...");

        for (DocumentUpload doc : docs) {
            session.beginTransaction();
            session.save(doc);
            session.getTransaction().commit();
        }

        System.out.println("Document have been uploaded!");
    }

    public static void deleteDocumentFromDB(Session session, Integer id) {

        System.out.println("Deleting, wait...");

        DocumentHeader header = null;
        Transaction transaction = session.beginTransaction();
        DocumentDownload doc = session.get(DocumentDownload.class, id);
        session.delete(doc);
        transaction.commit();

        Query query = session.createQuery("from DocumentHeader where id=" + id);
        for (Object o : query.list())
            if (((DocumentHeader) o).getDocNum().equals(id))
                header = (DocumentHeader) o;
        if (header != null) {
            session.beginTransaction();
            session.delete(header);
            session.flush();
            session.getTransaction().commit();
        }

        System.out.println("Document have been deleted!");
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();

        try {

            mocks = EntityMock.createUploadMocks();

            uploadDocumentToDB(session, mocks);

            for (Integer i = 16; i <= 25; i ++)
                deleteDocumentFromDB(session, i);

             System.out.println("Querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();

            Query query = session.createQuery("from DocumentHeader ");
            System.out.println("Executing: " + query.getQueryString());
            for (Object o : query.list())
                headers.add((DocumentHeader) o);

            Query query = session.createQuery("from DocumentDownload");
            System.out.println("Executing: " + query.getQueryString());
            for (Object o : query.list())
                downloads.add((DocumentDownload) o);

            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("Executing: " + query.getQueryString());
                for (Object o : query.list())
                    headers.add((DocumentHeader) o);
            }

            for (DocumentHeader header : headers)
                System.out.println(header);

            for (DocumentUpload upload : mocks)
                System.out.println(upload);

            for (DocumentDownload download : downloads)
                controller.writeFile("D:" + File.separator + "!DOC" + File.separator + download.getDocFileName(), download.getDocStream());
        }
        finally {
            session.shutdown();
        }
    }*/
}
