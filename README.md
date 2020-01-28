<h1>Automatização dos dados ANS</h1>
<ul>
Realizar download de forma automatizada (Cloud Functions) de arquivos
.ZIP com informações consolidadas de beneficiários da ANS
(URL pública) para área temporária do Cloud Functions (/tmp/) que,
posteriormente, serão extraídas em formato .CSV na própria área
temporária e, seu conteúdo, disponibilizado no BigQuery.
</ul>

<h2>Link para download ou clonar o código fonte</h2>
<a href=""></a>

<h2>Estrutura do código</h2>

<h3>Cloud Function</h3>
<ul>Descrição: o código está em uma função no cloud functions chamado download_ans com as seguintes configurações.</ul>

<ul>
<li>Nome:  download_ans</li>
<li>Memória alocada: 2GB</li>
<li>Acionador: PUB/SUB</li> 
<li>Tempo limite: 540</li>
</ul>

<h4>Função a ser executada: download_ans</h4>

<ul>Variáveis de ambiente
    <li>ANS_DESTINATION_BUCKET = ans_files</li>
    <li>DESTINATION_BUCKET_FOLDER = informacoes_consolidadas_beneficiarios</li>
    <li>BASE_URL = http://ftp.dadosabertos.ans.gov.br/FTP/PDA/informacoes_consolidadas_de_beneficiarios/</li>
</ul>
<h3>Pub/Sub</h3>
<ul>
Descrição: O pubsub é usado para passar os estados brasileiros que estão alocados nos jobs que foram criados no cloud scheduler o PubSub é usado para passar os estados brasileiros que estão alocados nos jobs como parâmetro no código
</ul>  
<ul>Nome: ans_download_monthly</ul>

<h3>Cloud Scheduler</h3>

<ul>Descrição: Todos os estados brasileiros estão divididos em três jobs feito pelo cloud scheduler para quando for executado, acordar o Pub/Sub e depois inicializar a cloud function.</ul>
<ul>
    
| Jobs                  | UFs contidas em cada job               |
|-----------------------|----------------------------------------|
| ans-monthly-trigger-1 | SP, AL, AC, AM, PB, PE, PI, RN         |
| ans-monthly-trigger-2 | RO, RR, SC, SE, TO, MG, PR, BA, CE, DF |
| ans-monthly-trigger-3 | AP, ES, GO, MA, MS, MT, PA, XX, RJ, RS |
</ul>

