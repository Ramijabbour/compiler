// Generated from C:/Users/Rami/Desktop/compiler/untitled3/compiler/src\g.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T_Public=6, T_Private=7, T_Void=8, 
		T_ACTION=9, T_ADD2=10, T_ALL=11, T_ALLOCATE=12, T_ALTER=13, T_AND=14, 
		T_ANSI_NULLS=15, T_ANSI_PADDING=16, T_AS=17, T_ASC=18, T_ASSOCIATE=19, 
		T_AT=20, T_AUTO_INCREMENT=21, T_AVG=22, T_BATCHSIZE=23, T_BEGIN=24, T_BETWEEN=25, 
		T_BIGINT=26, T_BINARY_DOUBLE=27, T_BINARY_FLOAT=28, T_BINARY_INTEGER=29, 
		T_BIT=30, T_BODY=31, T_BREAK=32, T_BY=33, T_BYTE=34, T_CALL=35, T_CALLER=36, 
		T_CASCADE=37, T_CASE=38, T_CASESPECIFIC=39, T_CAST=40, T_CHAR=41, T_CHARACTER=42, 
		T_CHARSET=43, T_CLIENT=44, T_CLOSE=45, T_CLUSTERED=46, T_CMP=47, T_COLLECT=48, 
		T_COLLECTION=49, T_COLUMN=50, T_COMMENT=51, T_CONSTANT=52, T_COMMIT=53, 
		T_COMPRESS=54, T_CONCAT=55, T_CONDITION=56, T_CONSTRAINT=57, T_CONTINUE=58, 
		T_COPY=59, T_COUNT=60, T_COUNT_BIG=61, T_CREATE=62, T_CREATION=63, T_CREATOR=64, 
		T_CS=65, T_CURRENT=66, T_CURRENT_SCHEMA=67, T_CURSOR=68, T_DATABASE=69, 
		T_DATA=70, T_DATE=71, T_DATETIME=72, T_DAY=73, T_DAYS=74, T_DEC=75, T_DECIMAL=76, 
		T_DECLARE=77, T_DEFAULT=78, T_DEFERRED=79, T_DEFINED=80, T_DEFINER=81, 
		T_DEFINITION=82, T_DELETE=83, T_DELIMITED=84, T_DELIMITER=85, T_DESC=86, 
		T_DESCRIBE=87, T_DIAGNOSTICS=88, T_DIR=89, T_DIRECTORY=90, T_DISTINCT=91, 
		T_DISTRIBUTE=92, T_DO=93, T_DOUBLE=94, T_DROP=95, T_DYNAMIC=96, T_ELSE=97, 
		T_ELSEIF=98, T_ELSIF=99, T_ENABLE=100, T_END=101, T_ENGINE=102, T_ESCAPED=103, 
		T_EXCEPT=104, T_EXEC=105, T_EXECUTE=106, T_EXCEPTION=107, T_EXCLUSIVE=108, 
		T_EXISTS=109, T_EXIT=110, T_FALLBACK=111, T_FALSE=112, T_FETCH=113, T_FIELDS=114, 
		T_FILE=115, T_FILES=116, T_FLOAT=117, T_FOR=118, T_FOREIGN=119, T_FORMAT=120, 
		T_FOUND=121, T_FROM=122, T_FULL=123, T_FUNCTION=124, T_GET=125, T_GLOBAL=126, 
		T_GO=127, T_GRANT=128, T_GROUP=129, T_HANDLER=130, T_HASH=131, T_HAVING=132, 
		T_HDFS=133, T_HIVE=134, T_HOST=135, T_IDENTITY=136, T_IF=137, T_IGNORE=138, 
		T_IMMEDIATE=139, T_IN=140, T_INCLUDE=141, T_INDEX=142, T_INITRANS=143, 
		T_INNER=144, T_INOUT=145, T_INSERT=146, T_INT=147, T_INT2=148, T_INT4=149, 
		T_INT8=150, T_INTEGER=151, T_INTERSECT=152, T_INTERVAL=153, T_INTO=154, 
		T_INVOKER=155, T_IS=156, T_ISOPEN=157, T_ITEMS=158, T_JOIN=159, T_KEEP=160, 
		T_KEY=161, T_KEYS=162, T_LANGUAGE=163, T_LEAVE=164, T_LEFT=165, T_LIKE=166, 
		T_LIMIT=167, T_LINES=168, T_LOCAL=169, T_LOCATION=170, T_LOCATOR=171, 
		T_LOCATORS=172, T_LOCKS=173, T_LOG=174, T_LOGGED=175, T_LOGGING=176, T_LOOP=177, 
		T_MAP=178, T_MATCHED=179, T_MAX=180, T_MAXTRANS=181, T_MERGE=182, T_MESSAGE_TEXT=183, 
		T_MICROSECOND=184, T_MICROSECONDS=185, T_MIN=186, T_MULTISET=187, T_NCHAR=188, 
		T_NEW=189, T_NVARCHAR=190, T_NO=191, T_NOCOUNT=192, T_NOCOMPRESS=193, 
		T_NOLOGGING=194, T_NONE=195, T_NOT=196, T_NOTFOUND=197, T_NULL=198, T_NUMERIC=199, 
		T_NUMBER=200, T_OBJECT=201, T_OFF=202, T_ON=203, T_ONLY=204, T_OPEN=205, 
		T_OR=206, T_ORDER=207, T_OUT=208, T_OUTER=209, T_OVER=210, T_OVERWRITE=211, 
		T_OWNER=212, T_PACKAGE=213, T_PARTITION=214, T_PCTFREE=215, T_PCTUSED=216, 
		T_PLS_INTEGER=217, T_PRECISION=218, T_PRESERVE=219, T_PRIMARY=220, T_PRINT=221, 
		T_PROC=222, T_PROCEDURE=223, T_QUALIFY=224, T_QUERY_BAND=225, T_QUIT=226, 
		T_QUOTED_IDENTIFIER=227, T_RAISE=228, T_REAL=229, T_REFERENCES=230, T_REGEXP=231, 
		T_REPLACE=232, T_RESIGNAL=233, T_RESTRICT=234, T_RESULT=235, T_RESULT_SET_LOCATOR=236, 
		T_RETURN=237, T_RETURNS=238, T_REVERSE=239, T_RIGHT=240, T_RLIKE=241, 
		T_ROLE=242, T_ROLLBACK=243, T_ROW=244, T_ROWS=245, T_ROWTYPE=246, T_ROW_COUNT=247, 
		T_RR=248, T_RS=249, T_PWD=250, T_TRIM=251, T_SCHEMA=252, T_SECOND=253, 
		T_SECONDS=254, T_SECURITY=255, T_SEGMENT=256, T_SEL=257, T_SELECT=258, 
		T_SET=259, T_SESSION=260, T_SESSIONS=261, T_SETS=262, T_SHARE=263, T_SIGNAL=264, 
		T_SIMPLE_DOUBLE=265, T_SIMPLE_FLOAT=266, T_SIMPLE_INTEGER=267, T_SMALLDATETIME=268, 
		T_SMALLINT=269, T_SQL=270, T_SQLEXCEPTION=271, T_SQLINSERT=272, T_SQLSTATE=273, 
		T_SQLWARNING=274, T_STATS=275, T_STATISTICS=276, T_STEP=277, T_STORAGE=278, 
		T_STORED=279, T_STRING=280, T_SUBDIR=281, T_SUBSTRING=282, T_SUM=283, 
		T_SUMMARY=284, T_SYS_REFCURSOR=285, T_TABLE=286, T_TABLESPACE=287, T_TEMPORARY=288, 
		T_TERMINATED=289, T_TEXTIMAGE_ON=290, T_THEN=291, T_TIMESTAMP=292, T_TINYINT=293, 
		T_TITLE=294, T_TO=295, T_TOP=296, T_TRANSACTION=297, T_TRUE=298, T_TRUNCATE=299, 
		T_TYPE=300, T_UNION=301, T_UNIQUE=302, T_UPDATE=303, T_UR=304, T_USE=305, 
		T_USING=306, T_VALUE=307, T_VALUES=308, T_VAR=309, T_VARCHAR=310, T_VARCHAR2=311, 
		T_VARYING=312, T_VOLATILE=313, T_WHEN=314, T_WHERE=315, T_WHILE=316, T_WITH=317, 
		T_WITHOUT=318, T_WORK=319, T_XACT_ABORT=320, T_XML=321, T_YES=322, T_ACTIVITY_COUNT=323, 
		T_CUME_DIST=324, T_CURRENT_DATE=325, T_CURRENT_TIMESTAMP=326, T_CURRENT_USER=327, 
		T_DENSE_RANK=328, T_FIRST_VALUE=329, T_LAG=330, T_LAST_VALUE=331, T_LEAD=332, 
		T_MAX_PART_STRING=333, T_MIN_PART_STRING=334, T_MAX_PART_INT=335, T_MIN_PART_INT=336, 
		T_MAX_PART_DATE=337, T_MIN_PART_DATE=338, T_PART_COUNT=339, T_PART_LOC=340, 
		T_RANK=341, T_ROW_NUMBER=342, T_STDEV=343, T_SYSDATE=344, T_VARIANCE=345, 
		T_USER=346, T_ADD=347, T_COLON=348, T_COMMA=349, T_PIPE=350, T_DIV=351, 
		T_DOT2=352, T_EQUAL=353, T_EQUAL2=354, T_NOTEQUAL=355, T_NOTEQUAL2=356, 
		T_GREATER=357, T_GREATEREQUAL=358, T_LESS=359, T_LESSEQUAL=360, T_MUL=361, 
		T_OPEN_B=362, T_OPEN_P=363, T_OPEN_SB=364, T_CLOSE_B=365, T_CLOSE_P=366, 
		T_CLOSE_SB=367, T_SEMICOLON=368, T_SUB=369, L_ID=370, L_S_STRING=371, 
		L_D_STRING=372, L_INT=373, L_DEC=374, L_WS=375, L_M_COMMENT=376, L_S_COMMENT=377, 
		L_FILE=378, L_LABEL=379;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_semicolon_stmt = 7, 
		RULE_exception_block = 8, RULE_exception_block_item = 9, RULE_null_stmt = 10, 
		RULE_expr_stmt = 11, RULE_assignment_stmt = 12, RULE_assignment_stmt_item = 13, 
		RULE_assignment_stmt_single_item = 14, RULE_assignment_stmt_multiple_item = 15, 
		RULE_assignment_stmt_select_item = 16, RULE_allocate_cursor_stmt = 17, 
		RULE_associate_locator_stmt = 18, RULE_begin_transaction_stmt = 19, RULE_break_stmt = 20, 
		RULE_call_stmt = 21, RULE_declare_stmt = 22, RULE_declare_block = 23, 
		RULE_declare_block_inplace = 24, RULE_declare_stmt_item = 25, RULE_declare_var_item = 26, 
		RULE_declare_condition_item = 27, RULE_declare_cursor_item = 28, RULE_cursor_with_return = 29, 
		RULE_cursor_without_return = 30, RULE_declare_handler_item = 31, RULE_declare_temporary_table_item = 32, 
		RULE_create_table_stmt = 33, RULE_create_local_temp_table_stmt = 34, RULE_create_table_definition = 35, 
		RULE_create_table_columns = 36, RULE_create_table_columns_item = 37, RULE_column_name = 38, 
		RULE_return_type = 39, RULE_function_name = 40, RULE_global_scope = 41, 
		RULE_function_end = 42, RULE_function_stmnt = 43, RULE_pars = 44, RULE_varss = 45, 
		RULE_dtypee = 46, RULE_functions = 47, RULE_for_loop = 48, RULE_end_for = 49, 
		RULE_for_type = 50, RULE_error = 51, RULE_create_table_column_inline_cons = 52, 
		RULE_create_table_column_cons = 53, RULE_create_table_fk_action = 54, 
		RULE_create_table_preoptions = 55, RULE_create_table_preoptions_item = 56, 
		RULE_create_table_preoptions_td_item = 57, RULE_create_table_options = 58, 
		RULE_create_table_options_ed = 59, RULE_create_table_options_item = 60, 
		RULE_create_table_options_ora_item = 61, RULE_create_table_options_db2_item = 62, 
		RULE_create_table_options_td_item = 63, RULE_create_table_options_hive_item = 64, 
		RULE_create_table_hive_row_format = 65, RULE_create_table_hive_row_format_fields = 66, 
		RULE_create_table_options_mssql_item = 67, RULE_create_table_options_mysql_item = 68, 
		RULE_alter_table_stmt = 69, RULE_alter_table_item = 70, RULE_alter_table_add_constraint = 71, 
		RULE_alter_table_add_constraint_item = 72, RULE_dtype = 73, RULE_dtype_len = 74, 
		RULE_dtype_attr = 75, RULE_dtype_default = 76, RULE_create_database_stmt = 77, 
		RULE_create_database_option = 78, RULE_create_function_stmt = 79, RULE_create_function_return = 80, 
		RULE_create_package_stmt = 81, RULE_package_spec = 82, RULE_package_spec_item = 83, 
		RULE_create_package_body_stmt = 84, RULE_package_body = 85, RULE_package_body_item = 86, 
		RULE_create_procedure_stmt = 87, RULE_create_routine_params = 88, RULE_create_routine_param_item = 89, 
		RULE_create_routine_options = 90, RULE_create_routine_option = 91, RULE_drop_stmt = 92, 
		RULE_end_transaction_stmt = 93, RULE_exec_stmt = 94, RULE_if_stmt = 95, 
		RULE_if_plsql_stmt = 96, RULE_end_if = 97, RULE_if_tsql_stmt = 98, RULE_if_bteq_stmt = 99, 
		RULE_elseif_block = 100, RULE_else_block = 101, RULE_include_stmt = 102, 
		RULE_insert_stmt = 103, RULE_insert_stmt_cols = 104, RULE_insert_stmt_rows = 105, 
		RULE_insert_stmt_row = 106, RULE_insert_directory_stmt = 107, RULE_exit_stmt = 108, 
		RULE_get_diag_stmt = 109, RULE_get_diag_stmt_item = 110, RULE_get_diag_stmt_exception_item = 111, 
		RULE_get_diag_stmt_rowcount_item = 112, RULE_grant_stmt = 113, RULE_grant_stmt_item = 114, 
		RULE_leave_stmt = 115, RULE_map_object_stmt = 116, RULE_open_stmt = 117, 
		RULE_fetch_stmt = 118, RULE_collect_stats_stmt = 119, RULE_collect_stats_clause = 120, 
		RULE_close_stmt = 121, RULE_cmp_stmt = 122, RULE_cmp_source = 123, RULE_copy_from_local_stmt = 124, 
		RULE_copy_stmt = 125, RULE_copy_source = 126, RULE_copy_target = 127, 
		RULE_copy_option = 128, RULE_copy_file_option = 129, RULE_commit_stmt = 130, 
		RULE_create_index_stmt = 131, RULE_create_index_col = 132, RULE_index_storage_clause = 133, 
		RULE_index_mssql_storage_clause = 134, RULE_print_stmt = 135, RULE_quit_stmt = 136, 
		RULE_raise_stmt = 137, RULE_resignal_stmt = 138, RULE_return_stmt = 139, 
		RULE_rollback_stmt = 140, RULE_set_session_option = 141, RULE_set_current_schema_option = 142, 
		RULE_set_mssql_session_option = 143, RULE_set_teradata_session_option = 144, 
		RULE_signal_stmt = 145, RULE_summary_stmt = 146, RULE_truncate_stmt = 147, 
		RULE_use_stmt = 148, RULE_values_into_stmt = 149, RULE_while_stmt = 150, 
		RULE_for_cursor_stmt = 151, RULE_for_range_stmt = 152, RULE_label = 153, 
		RULE_using_clause = 154, RULE_select_stmt = 155, RULE_cte_select_stmt = 156, 
		RULE_cte_select_stmt_item = 157, RULE_cte_select_cols = 158, RULE_fullselect_stmt = 159, 
		RULE_fullselect_stmt_item = 160, RULE_fullselect_set_clause = 161, RULE_subselect_stmt = 162, 
		RULE_select_list = 163, RULE_select_list_set = 164, RULE_select_list_limit = 165, 
		RULE_select_list_item = 166, RULE_select_list_alias = 167, RULE_select_list_asterisk = 168, 
		RULE_into_clause = 169, RULE_from_clause = 170, RULE_from_table_clause = 171, 
		RULE_from_table_name_clause = 172, RULE_from_subselect_clause = 173, RULE_from_join_clause = 174, 
		RULE_from_join_type_clause = 175, RULE_from_table_values_clause = 176, 
		RULE_from_table_values_row = 177, RULE_from_alias_clause = 178, RULE_table_name = 179, 
		RULE_where_clause = 180, RULE_group_by_clause = 181, RULE_having_clause = 182, 
		RULE_qualify_clause = 183, RULE_order_by_clause = 184, RULE_select_options = 185, 
		RULE_select_options_item = 186, RULE_update_stmt = 187, RULE_update_assignment = 188, 
		RULE_update_table = 189, RULE_update_upsert = 190, RULE_merge_stmt = 191, 
		RULE_merge_table = 192, RULE_merge_condition = 193, RULE_merge_action = 194, 
		RULE_delete_stmt = 195, RULE_delete_alias = 196, RULE_describe_stmt = 197, 
		RULE_bool_expr = 198, RULE_bool_expr_atom = 199, RULE_bool_expr_unary = 200, 
		RULE_bool_expr_single_in = 201, RULE_bool_expr_multi_in = 202, RULE_bool_expr_binary = 203, 
		RULE_bool_expr_logical_operator = 204, RULE_bool_expr_binary_operator = 205, 
		RULE_expr = 206, RULE_expr_atom = 207, RULE_expr_interval = 208, RULE_interval_item = 209, 
		RULE_expr_concat = 210, RULE_expr_concat_item = 211, RULE_expr_case = 212, 
		RULE_expr_case_simple = 213, RULE_expr_case_searched = 214, RULE_expr_cursor_attribute = 215, 
		RULE_expr_agg_window_func = 216, RULE_expr_func_all_distinct = 217, RULE_expr_func_over_clause = 218, 
		RULE_expr_func_partition_by_clause = 219, RULE_expr_spec_func = 220, RULE_expr_func = 221, 
		RULE_expr_func_params = 222, RULE_func_param = 223, RULE_expr_select = 224, 
		RULE_expr_file = 225, RULE_hive = 226, RULE_hive_item = 227, RULE_host = 228, 
		RULE_host_cmd = 229, RULE_host_stmt = 230, RULE_file_name = 231, RULE_date_literal = 232, 
		RULE_timestamp_literal = 233, RULE_ident = 234, RULE_string = 235, RULE_int_number = 236, 
		RULE_dec_number = 237, RULE_bool_literal = 238, RULE_null_const = 239, 
		RULE_non_reserved_words = 240;
	public static final String[] ruleNames = {
		"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
		"proc_block", "stmt", "semicolon_stmt", "exception_block", "exception_block_item", 
		"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", "assignment_stmt_single_item", 
		"assignment_stmt_multiple_item", "assignment_stmt_select_item", "allocate_cursor_stmt", 
		"associate_locator_stmt", "begin_transaction_stmt", "break_stmt", "call_stmt", 
		"declare_stmt", "declare_block", "declare_block_inplace", "declare_stmt_item", 
		"declare_var_item", "declare_condition_item", "declare_cursor_item", "cursor_with_return", 
		"cursor_without_return", "declare_handler_item", "declare_temporary_table_item", 
		"create_table_stmt", "create_local_temp_table_stmt", "create_table_definition", 
		"create_table_columns", "create_table_columns_item", "column_name", "return_type", 
		"function_name", "global_scope", "function_end", "function_stmnt", "pars", 
		"varss", "dtypee", "functions", "for_loop", "end_for", "for_type", "error", 
		"create_table_column_inline_cons", "create_table_column_cons", "create_table_fk_action", 
		"create_table_preoptions", "create_table_preoptions_item", "create_table_preoptions_td_item", 
		"create_table_options", "create_table_options_ed", "create_table_options_item", 
		"create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_td_item", 
		"create_table_options_hive_item", "create_table_hive_row_format", "create_table_hive_row_format_fields", 
		"create_table_options_mssql_item", "create_table_options_mysql_item", 
		"alter_table_stmt", "alter_table_item", "alter_table_add_constraint", 
		"alter_table_add_constraint_item", "dtype", "dtype_len", "dtype_attr", 
		"dtype_default", "create_database_stmt", "create_database_option", "create_function_stmt", 
		"create_function_return", "create_package_stmt", "package_spec", "package_spec_item", 
		"create_package_body_stmt", "package_body", "package_body_item", "create_procedure_stmt", 
		"create_routine_params", "create_routine_param_item", "create_routine_options", 
		"create_routine_option", "drop_stmt", "end_transaction_stmt", "exec_stmt", 
		"if_stmt", "if_plsql_stmt", "end_if", "if_tsql_stmt", "if_bteq_stmt", 
		"elseif_block", "else_block", "include_stmt", "insert_stmt", "insert_stmt_cols", 
		"insert_stmt_rows", "insert_stmt_row", "insert_directory_stmt", "exit_stmt", 
		"get_diag_stmt", "get_diag_stmt_item", "get_diag_stmt_exception_item", 
		"get_diag_stmt_rowcount_item", "grant_stmt", "grant_stmt_item", "leave_stmt", 
		"map_object_stmt", "open_stmt", "fetch_stmt", "collect_stats_stmt", "collect_stats_clause", 
		"close_stmt", "cmp_stmt", "cmp_source", "copy_from_local_stmt", "copy_stmt", 
		"copy_source", "copy_target", "copy_option", "copy_file_option", "commit_stmt", 
		"create_index_stmt", "create_index_col", "index_storage_clause", "index_mssql_storage_clause", 
		"print_stmt", "quit_stmt", "raise_stmt", "resignal_stmt", "return_stmt", 
		"rollback_stmt", "set_session_option", "set_current_schema_option", "set_mssql_session_option", 
		"set_teradata_session_option", "signal_stmt", "summary_stmt", "truncate_stmt", 
		"use_stmt", "values_into_stmt", "while_stmt", "for_cursor_stmt", "for_range_stmt", 
		"label", "using_clause", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", 
		"cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", 
		"subselect_stmt", "select_list", "select_list_set", "select_list_limit", 
		"select_list_item", "select_list_alias", "select_list_asterisk", "into_clause", 
		"from_clause", "from_table_clause", "from_table_name_clause", "from_subselect_clause", 
		"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
		"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
		"group_by_clause", "having_clause", "qualify_clause", "order_by_clause", 
		"select_options", "select_options_item", "update_stmt", "update_assignment", 
		"update_table", "update_upsert", "merge_stmt", "merge_table", "merge_condition", 
		"merge_action", "delete_stmt", "delete_alias", "describe_stmt", "bool_expr", 
		"bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", 
		"bool_expr_binary", "bool_expr_logical_operator", "bool_expr_binary_operator", 
		"expr", "expr_atom", "expr_interval", "interval_item", "expr_concat", 
		"expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
		"expr_cursor_attribute", "expr_agg_window_func", "expr_func_all_distinct", 
		"expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func", 
		"expr_func", "expr_func_params", "func_param", "expr_select", "expr_file", 
		"hive", "hive_item", "host", "host_cmd", "host_stmt", "file_name", "date_literal", 
		"timestamp_literal", "ident", "string", "int_number", "dec_number", "bool_literal", 
		"null_const", "non_reserved_words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'#'", "'%'", "'.'", "'!'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'+'", "':'", "','", "'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", 
		"'>'", "'>='", "'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", 
		"']'", "';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "T_Public", "T_Private", "T_Void", 
		"T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", "T_ALTER", "T_AND", "T_ANSI_NULLS", 
		"T_ANSI_PADDING", "T_AS", "T_ASC", "T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", 
		"T_AVG", "T_BATCHSIZE", "T_BEGIN", "T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", 
		"T_BINARY_FLOAT", "T_BINARY_INTEGER", "T_BIT", "T_BODY", "T_BREAK", "T_BY", 
		"T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", "T_CASE", "T_CASESPECIFIC", 
		"T_CAST", "T_CHAR", "T_CHARACTER", "T_CHARSET", "T_CLIENT", "T_CLOSE", 
		"T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION", "T_COLUMN", "T_COMMENT", 
		"T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", "T_CONDITION", "T_CONSTRAINT", 
		"T_CONTINUE", "T_COPY", "T_COUNT", "T_COUNT_BIG", "T_CREATE", "T_CREATION", 
		"T_CREATOR", "T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", 
		"T_DATA", "T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", 
		"T_DECLARE", "T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", 
		"T_DELETE", "T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", 
		"T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", 
		"T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", 
		"T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", 
		"T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", "T_FALSE", "T_FETCH", 
		"T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", 
		"T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", 
		"T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", "T_HIVE", 
		"T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", 
		"T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", 
		"T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", 
		"T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", 
		"T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", 
		"T_LOCAL", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", 
		"T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", 
		"T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", 
		"T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", 
		"T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", "T_NUMERIC", 
		"T_NUMBER", "T_OBJECT", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", 
		"T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", 
		"T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", 
		"T_PRIMARY", "T_PRINT", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", 
		"T_QUIT", "T_QUOTED_IDENTIFIER", "T_RAISE", "T_REAL", "T_REFERENCES", 
		"T_REGEXP", "T_REPLACE", "T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", 
		"T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", 
		"T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", 
		"T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
		"T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", "T_SESSIONS", 
		"T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
		"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
		"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STATS", "T_STATISTICS", 
		"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_SUBDIR", "T_SUBSTRING", 
		"T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY", 
		"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
		"T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", "T_TYPE", 
		"T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", "T_VALUE", 
		"T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", 
		"T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", 
		"T_XML", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", "T_CURRENT_DATE", 
		"T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", "T_FIRST_VALUE", 
		"T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", "T_MIN_PART_STRING", 
		"T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", "T_MIN_PART_DATE", 
		"T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", "T_STDEV", "T_SYSDATE", 
		"T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", "T_PIPE", "T_DIV", 
		"T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", 
		"T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", "T_OPEN_P", 
		"T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", "T_SUB", 
		"L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS", "L_M_COMMENT", 
		"L_S_COMMENT", "L_FILE", "L_LABEL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			block();
			setState(483);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(gParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(gParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(487);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(485);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(486);
						stmt();
						}
						break;
					}
					setState(490);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(489);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(494); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(gParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBegin_end_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(496);
				declare_block();
				}
			}

			setState(499);
			match(T_BEGIN);
			setState(500);
			block();
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(501);
				exception_block();
				}
				break;
			}
			setState(504);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(gParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSingle_block_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(T_BEGIN);
				setState(507);
				block();
				setState(509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(508);
					exception_block();
					}
					break;
				}
				setState(511);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				stmt();
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(514);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(520);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(gParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(523);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(526); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(528);
					match(T_GO);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public VarssContext varss() {
			return getRuleContext(VarssContext.class,0);
		}
		public Global_scopeContext global_scope() {
			return getRuleContext(Global_scopeContext.class,0);
		}
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Allocate_cursor_stmtContext allocate_cursor_stmt() {
			return getRuleContext(Allocate_cursor_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Associate_locator_stmtContext associate_locator_stmt() {
			return getRuleContext(Associate_locator_stmtContext.class,0);
		}
		public Begin_transaction_stmtContext begin_transaction_stmt() {
			return getRuleContext(Begin_transaction_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Collect_stats_stmtContext collect_stats_stmt() {
			return getRuleContext(Collect_stats_stmtContext.class,0);
		}
		public Close_stmtContext close_stmt() {
			return getRuleContext(Close_stmtContext.class,0);
		}
		public Cmp_stmtContext cmp_stmt() {
			return getRuleContext(Cmp_stmtContext.class,0);
		}
		public Copy_from_local_stmtContext copy_from_local_stmt() {
			return getRuleContext(Copy_from_local_stmtContext.class,0);
		}
		public Copy_stmtContext copy_stmt() {
			return getRuleContext(Copy_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Describe_stmtContext describe_stmt() {
			return getRuleContext(Describe_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public End_transaction_stmtContext end_transaction_stmt() {
			return getRuleContext(End_transaction_stmtContext.class,0);
		}
		public Exec_stmtContext exec_stmt() {
			return getRuleContext(Exec_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Fetch_stmtContext fetch_stmt() {
			return getRuleContext(Fetch_stmtContext.class,0);
		}
		public For_cursor_stmtContext for_cursor_stmt() {
			return getRuleContext(For_cursor_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Include_stmtContext include_stmt() {
			return getRuleContext(Include_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Insert_directory_stmtContext insert_directory_stmt() {
			return getRuleContext(Insert_directory_stmtContext.class,0);
		}
		public Get_diag_stmtContext get_diag_stmt() {
			return getRuleContext(Get_diag_stmtContext.class,0);
		}
		public Grant_stmtContext grant_stmt() {
			return getRuleContext(Grant_stmtContext.class,0);
		}
		public Leave_stmtContext leave_stmt() {
			return getRuleContext(Leave_stmtContext.class,0);
		}
		public Map_object_stmtContext map_object_stmt() {
			return getRuleContext(Map_object_stmtContext.class,0);
		}
		public Merge_stmtContext merge_stmt() {
			return getRuleContext(Merge_stmtContext.class,0);
		}
		public Open_stmtContext open_stmt() {
			return getRuleContext(Open_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Quit_stmtContext quit_stmt() {
			return getRuleContext(Quit_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public Resignal_stmtContext resignal_stmt() {
			return getRuleContext(Resignal_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Signal_stmtContext signal_stmt() {
			return getRuleContext(Signal_stmtContext.class,0);
		}
		public Summary_stmtContext summary_stmt() {
			return getRuleContext(Summary_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Use_stmtContext use_stmt() {
			return getRuleContext(Use_stmtContext.class,0);
		}
		public Truncate_stmtContext truncate_stmt() {
			return getRuleContext(Truncate_stmtContext.class,0);
		}
		public Values_into_stmtContext values_into_stmt() {
			return getRuleContext(Values_into_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public HiveContext hive() {
			return getRuleContext(HiveContext.class,0);
		}
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Function_stmntContext function_stmnt() {
			return getRuleContext(Function_stmntContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				varss();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				global_scope();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				assignment_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				allocate_cursor_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(537);
				alter_table_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(538);
				associate_locator_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(539);
				begin_transaction_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(540);
				break_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(541);
				call_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(542);
				collect_stats_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(543);
				close_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(544);
				cmp_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(545);
				copy_from_local_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(546);
				copy_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(547);
				commit_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(548);
				create_database_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(549);
				create_function_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(550);
				create_index_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(551);
				create_local_temp_table_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(552);
				create_package_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(553);
				create_package_body_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(554);
				create_procedure_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(555);
				create_table_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(556);
				declare_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(557);
				delete_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(558);
				describe_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(559);
				drop_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(560);
				end_transaction_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(561);
				exec_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(562);
				exit_stmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(563);
				fetch_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(564);
				for_cursor_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(565);
				for_range_stmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(566);
				if_stmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(567);
				include_stmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(568);
				insert_stmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(569);
				insert_directory_stmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(570);
				get_diag_stmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(571);
				grant_stmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(572);
				leave_stmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(573);
				map_object_stmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(574);
				merge_stmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(575);
				open_stmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(576);
				print_stmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(577);
				quit_stmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(578);
				raise_stmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(579);
				resignal_stmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(580);
				return_stmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(581);
				rollback_stmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(582);
				select_stmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(583);
				signal_stmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(584);
				summary_stmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(585);
				update_stmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(586);
				use_stmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(587);
				truncate_stmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(588);
				values_into_stmt();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(589);
				while_stmt();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(590);
				label();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(591);
				hive();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(592);
				host();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(593);
				null_stmt();
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(594);
				expr_stmt();
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(595);
				function_stmnt();
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(596);
				semicolon_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSemicolon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSemicolon_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSemicolon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(gParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterException_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitException_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitException_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(T_EXCEPTION);
			setState(603); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(602);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(605); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(gParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(gParser.T_WHEN, i);
		}
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterException_block_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitException_block_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitException_block_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T_WHEN);
			setState(608);
			match(L_ID);
			setState(609);
			match(T_THEN);
			setState(610);
			block();
			setState(611);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNull_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNull_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNull_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(616);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public Set_session_optionContext set_session_option() {
			return getRuleContext(Set_session_optionContext.class,0);
		}
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_stmt);
		try {
			int _alt;
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(T_SET);
				setState(619);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(620);
					match(T_SET);
					}
					break;
				}
				setState(623);
				assignment_stmt_item();
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						match(T_COMMA);
						setState(625);
						assignment_stmt_item();
						}
						} 
					}
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class,0);
		}
		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class,0);
		}
		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class,0);
		}
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt_item);
		try {
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(635);
				assignment_stmt_select_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(gParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_single_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt_single_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt_single_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt_single_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				ident();
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(639);
					match(T_COLON);
					}
				}

				setState(642);
				match(T_EQUAL);
				setState(643);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				match(T_OPEN_P);
				setState(646);
				ident();
				setState(647);
				match(T_CLOSE_P);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(648);
					match(T_COLON);
					}
				}

				setState(651);
				match(T_EQUAL);
				setState(652);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(gParser.T_COLON, 0); }
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_multiple_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt_multiple_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt_multiple_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt_multiple_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(T_OPEN_P);
			setState(657);
			ident();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(658);
				match(T_COMMA);
				setState(659);
				ident();
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			match(T_CLOSE_P);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(666);
				match(T_COLON);
				}
			}

			setState(669);
			match(T_EQUAL);
			setState(670);
			match(T_OPEN_P);
			setState(671);
			expr(0);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(672);
				match(T_COMMA);
				setState(673);
				expr(0);
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(gParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt_select_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt_select_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(681);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(682);
				match(T_OPEN_P);
				setState(683);
				ident();
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(684);
					match(T_COMMA);
					setState(685);
					ident();
					}
					}
					setState(690);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(691);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(695);
				match(T_COLON);
				}
			}

			setState(698);
			match(T_EQUAL);
			setState(699);
			match(T_OPEN_P);
			setState(700);
			select_stmt();
			setState(701);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Allocate_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALLOCATE() { return getToken(gParser.T_ALLOCATE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CURSOR() { return getToken(gParser.T_CURSOR, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(gParser.T_PROCEDURE, 0); }
		public TerminalNode T_RESULT() { return getToken(gParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public Allocate_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocate_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAllocate_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAllocate_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAllocate_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Allocate_cursor_stmtContext allocate_cursor_stmt() throws RecognitionException {
		Allocate_cursor_stmtContext _localctx = new Allocate_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_allocate_cursor_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T_ALLOCATE);
			setState(704);
			ident();
			setState(705);
			match(T_CURSOR);
			setState(706);
			match(T_FOR);
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_RESULT:
				{
				{
				setState(707);
				match(T_RESULT);
				setState(708);
				match(T_SET);
				}
				}
				break;
			case T_PROCEDURE:
				{
				setState(709);
				match(T_PROCEDURE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(712);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associate_locator_stmtContext extends ParserRuleContext {
		public TerminalNode T_ASSOCIATE() { return getToken(gParser.T_ASSOCIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(gParser.T_PROCEDURE, 0); }
		public TerminalNode T_LOCATOR() { return getToken(gParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(gParser.T_LOCATORS, 0); }
		public TerminalNode T_RESULT() { return getToken(gParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Associate_locator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associate_locator_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssociate_locator_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssociate_locator_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssociate_locator_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		Associate_locator_stmtContext _localctx = new Associate_locator_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(T_ASSOCIATE);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
				{
				setState(715);
				match(T_RESULT);
				setState(716);
				match(T_SET);
				}
			}

			setState(719);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(720);
			match(T_OPEN_P);
			setState(721);
			ident();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(722);
				match(T_COMMA);
				setState(723);
				ident();
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			match(T_CLOSE_P);
			setState(730);
			match(T_WITH);
			setState(731);
			match(T_PROCEDURE);
			setState(732);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(gParser.T_BEGIN, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(gParser.T_TRANSACTION, 0); }
		public Begin_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBegin_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBegin_transaction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBegin_transaction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_transaction_stmtContext begin_transaction_stmt() throws RecognitionException {
		Begin_transaction_stmtContext _localctx = new Begin_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_begin_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(T_BEGIN);
			setState(735);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode T_BREAK() { return getToken(gParser.T_BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(T_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode T_CALL() { return getToken(gParser.T_CALL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(T_CALL);
			setState(740);
			ident();
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(741);
				match(T_OPEN_P);
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(742);
					expr_func_params();
					}
					break;
				}
				setState(745);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(746);
				expr_func_params();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(gParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(T_DECLARE);
			setState(750);
			declare_stmt_item();
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(751);
					match(T_COMMA);
					setState(752);
					declare_stmt_item();
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(gParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(T_DECLARE);
			setState(759);
			declare_stmt_item();
			setState(760);
			match(T_SEMICOLON);
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(761);
					declare_stmt_item();
					setState(762);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_block_inplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			declare_stmt_item();
			setState(770);
			match(T_SEMICOLON);
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(771);
					declare_stmt_item();
					setState(772);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_stmt_item);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(782);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(783);
				declare_temporary_table_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(gParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_var_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				ident();
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(787);
					match(T_COMMA);
					setState(788);
					ident();
					}
					}
					setState(793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(795);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(794);
					match(T_AS);
					}
					break;
				}
				setState(797);
				dtype();
				setState(799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(798);
					dtype_len();
					}
					break;
				}
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(801);
						dtype_attr();
						}
						} 
					}
					setState(806);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(807);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				ident();
				setState(811);
				match(T_CONSTANT);
				setState(813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(812);
					match(T_AS);
					}
					break;
				}
				setState(815);
				dtype();
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(816);
					dtype_len();
					}
				}

				setState(819);
				dtype_default();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(gParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_condition_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			ident();
			setState(824);
			match(T_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(gParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_cursor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(826);
				match(T_CURSOR);
				setState(827);
				ident();
				}
				break;
			case 2:
				{
				setState(828);
				ident();
				setState(829);
				match(T_CURSOR);
				}
				break;
			}
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(833);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(834);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(837);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(838);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(839);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(gParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(gParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(gParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(gParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCursor_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(T_WITH);
			setState(843);
			match(T_RETURN);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(844);
				match(T_ONLY);
				}
			}

			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(847);
				match(T_TO);
				setState(848);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(gParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCursor_without_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(T_WITHOUT);
			setState(852);
			match(T_RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(gParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(gParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(gParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(gParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(gParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(gParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_handler_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(855);
			match(T_HANDLER);
			setState(856);
			match(T_FOR);
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(857);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(858);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(859);
				match(T_NOT);
				setState(860);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(861);
				ident();
				}
				break;
			}
			setState(864);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(gParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(gParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_temporary_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(866);
				match(T_GLOBAL);
				}
			}

			setState(869);
			match(T_TEMPORARY);
			setState(870);
			match(T_TABLE);
			setState(871);
			ident();
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_COMMA) {
				{
				setState(872);
				create_table_preoptions();
				}
			}

			setState(875);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(gParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(T_CREATE);
			setState(878);
			match(T_TABLE);
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(879);
				match(T_IF);
				setState(880);
				match(T_NOT);
				setState(881);
				match(T_EXISTS);
				}
				break;
			}
			setState(884);
			table_name();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_COMMA) {
				{
				setState(885);
				create_table_preoptions();
				}
			}

			setState(888);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(gParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(gParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(gParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(gParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_local_temp_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(T_CREATE);
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(891);
				match(T_LOCAL);
				setState(892);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(893);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(896);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(899);
			match(T_TABLE);
			setState(900);
			ident();
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_COMMA) {
				{
				setState(901);
				create_table_preoptions();
				}
			}

			setState(904);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public Create_table_options_edContext create_table_options_ed() {
			return getRuleContext(Create_table_options_edContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(906);
					match(T_AS);
					}
				}

				setState(909);
				match(T_OPEN_P);
				setState(910);
				select_stmt();
				setState(911);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(913);
					match(T_AS);
					}
				}

				setState(916);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(917);
				match(T_OPEN_P);
				setState(918);
				create_table_columns();
				setState(919);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(923);
				create_table_options_ed();
				}
				break;
			}
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(926);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			create_table_columns_item();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(930);
				match(T_COMMA);
				setState(931);
				create_table_columns_item();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(gParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_columns_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				column_name();
				setState(938);
				dtype();
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(939);
					dtype_len();
					}
				}

				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(942);
						dtype_attr();
						}
						} 
					}
					setState(947);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T_DEFAULT - 78)) | (1L << (T_ENABLE - 78)) | (1L << (T_IDENTITY - 78)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (T_NOT - 196)) | (1L << (T_NULL - 196)) | (1L << (T_PRIMARY - 196)) | (1L << (T_REFERENCES - 196)))) != 0) || ((((_la - 302)) & ~0x3f) == 0 && ((1L << (_la - 302)) & ((1L << (T_UNIQUE - 302)) | (1L << (T_WITH - 302)) | (1L << (T_COLON - 302)) | (1L << (T_EQUAL - 302)))) != 0)) {
					{
					{
					setState(948);
					create_table_column_inline_cons();
					}
					}
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(954);
					match(T_CONSTRAINT);
					setState(955);
					ident();
					}
				}

				setState(958);
				create_table_column_cons();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(gParser.T_INT, 0); }
		public TerminalNode T_FLOAT() { return getToken(gParser.T_FLOAT, 0); }
		public TerminalNode T_Void() { return getToken(gParser.T_Void, 0); }
		public TerminalNode T_STRING() { return getToken(gParser.T_STRING, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_la = _input.LA(1);
			if ( !(_la==T_Void || _la==T_FLOAT || _la==T_INT || _la==T_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_scopeContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public Function_endContext function_end() {
			return getRuleContext(Function_endContext.class,0);
		}
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public List<VarssContext> varss() {
			return getRuleContexts(VarssContext.class);
		}
		public VarssContext varss(int i) {
			return getRuleContext(VarssContext.class,i);
		}
		public List<Function_stmntContext> function_stmnt() {
			return getRuleContexts(Function_stmntContext.class);
		}
		public Function_stmntContext function_stmnt(int i) {
			return getRuleContext(Function_stmntContext.class,i);
		}
		public Global_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGlobal_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGlobal_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGlobal_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_scopeContext global_scope() throws RecognitionException {
		Global_scopeContext _localctx = new Global_scopeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_global_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			function_name();
			setState(968);
			match(T_OPEN_B);
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_Void) | (1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CREATOR - 64)) | (1L << (T_CS - 64)) | (1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_GRANT - 128)) | (1L << (T_GROUP - 128)) | (1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOUNT - 192)) | (1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				setState(971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(969);
					varss();
					}
					break;
				case 2:
					{
					setState(970);
					function_stmnt();
					}
					break;
				}
				}
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(976);
			function_end();
			setState(977);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_endContext extends ParserRuleContext {
		public Function_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_endContext function_end() throws RecognitionException {
		Function_endContext _localctx = new Function_endContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_stmntContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public Function_endContext function_end() {
			return getRuleContext(Function_endContext.class,0);
		}
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
		}
		public List<ParsContext> pars() {
			return getRuleContexts(ParsContext.class);
		}
		public ParsContext pars(int i) {
			return getRuleContext(ParsContext.class,i);
		}
		public Function_stmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_stmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_stmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_stmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_stmntContext function_stmnt() throws RecognitionException {
		Function_stmntContext _localctx = new Function_stmntContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_stmnt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			return_type();
			setState(982);
			function_name();
			setState(983);
			match(T_OPEN_P);
			setState(991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_OPEN_B:
			case L_ID:
				{
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CREATOR - 64)) | (1L << (T_CS - 64)) | (1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_GRANT - 128)) | (1L << (T_GROUP - 128)) | (1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOUNT - 192)) | (1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
					{
					{
					setState(984);
					pars();
					}
					}
					setState(989);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_CLOSE_P:
				{
				setState(990);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(993);
			match(T_OPEN_B);
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(994);
					functions();
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(1000);
			function_end();
			setState(1001);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParsContext extends ParserRuleContext {
		public DtypeeContext dtypee() {
			return getRuleContext(DtypeeContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public ParsContext pars() {
			return getRuleContext(ParsContext.class,0);
		}
		public ParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParsContext pars() throws RecognitionException {
		ParsContext _localctx = new ParsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_pars);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				dtypee();
				setState(1004);
				column_name();
				setState(1005);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1007);
				dtypee();
				setState(1008);
				column_name();
				setState(1009);
				match(T_COMMA);
				setState(1010);
				pars();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarssContext extends ParserRuleContext {
		public DtypeeContext dtypee() {
			return getRuleContext(DtypeeContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public VarssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterVarss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitVarss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVarss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarssContext varss() throws RecognitionException {
		VarssContext _localctx = new VarssContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_varss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			dtypee();
			setState(1015);
			column_name();
			setState(1016);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeeContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(gParser.T_INT, 0); }
		public TerminalNode T_FLOAT() { return getToken(gParser.T_FLOAT, 0); }
		public TerminalNode T_CHAR() { return getToken(gParser.T_CHAR, 0); }
		public TerminalNode T_TRUE() { return getToken(gParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(gParser.T_FALSE, 0); }
		public TerminalNode T_STRING() { return getToken(gParser.T_STRING, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public DtypeeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtypee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDtypee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDtypee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDtypee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeeContext dtypee() throws RecognitionException {
		DtypeeContext _localctx = new DtypeeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dtypee);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				match(T_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(T_FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020);
				match(T_CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1021);
				match(T_TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1022);
				match(T_FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1023);
				match(T_STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1024);
				error();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public VarssContext varss() {
			return getRuleContext(VarssContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functions);
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				varss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1030);
				for_loop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<Int_numberContext> int_number() {
			return getRuleContexts(Int_numberContext.class);
		}
		public Int_numberContext int_number(int i) {
			return getRuleContext(Int_numberContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_LOOP() { return getToken(gParser.T_LOOP, 0); }
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
		}
		public For_typeContext for_type() {
			return getRuleContext(For_typeContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public End_forContext end_for() {
			return getRuleContext(End_forContext.class,0);
		}
		public TerminalNode T_GREATER() { return getToken(gParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(gParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LESS() { return getToken(gParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(gParser.T_LESSEQUAL, 0); }
		public List<TerminalNode> T_ADD() { return getTokens(gParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(gParser.T_ADD, i);
		}
		public List<TerminalNode> T_SUB() { return getTokens(gParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(gParser.T_SUB, i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_for_loop);
		int _la;
		try {
			int _alt;
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				match(T_FOR);
				setState(1034);
				match(T_OPEN_P);
				setState(1035);
				int_number();
				setState(1036);
				match(T_COLON);
				setState(1037);
				int_number();
				setState(1038);
				match(T_CLOSE_P);
				setState(1039);
				match(T_LOOP);
				setState(1043);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1040);
						functions();
						}
						} 
					}
					setState(1045);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(1046);
				match(T_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				match(T_FOR);
				setState(1049);
				match(T_OPEN_P);
				setState(1050);
				for_type();
				setState(1051);
				column_name();
				setState(1052);
				match(T_EQUAL);
				setState(1053);
				int_number();
				setState(1054);
				match(T_SEMICOLON);
				setState(1055);
				column_name();
				setState(1056);
				_la = _input.LA(1);
				if ( !(((((_la - 357)) & ~0x3f) == 0 && ((1L << (_la - 357)) & ((1L << (T_GREATER - 357)) | (1L << (T_GREATEREQUAL - 357)) | (1L << (T_LESS - 357)) | (1L << (T_LESSEQUAL - 357)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1057);
				int_number();
				setState(1058);
				match(T_SEMICOLON);
				setState(1059);
				column_name();
				setState(1064);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ADD:
					{
					setState(1060);
					match(T_ADD);
					setState(1061);
					match(T_ADD);
					}
					break;
				case T_SUB:
					{
					setState(1062);
					match(T_SUB);
					setState(1063);
					match(T_SUB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1066);
				match(T_CLOSE_P);
				setState(1067);
				match(T_OPEN_B);
				setState(1071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1068);
						functions();
						}
						} 
					}
					setState(1073);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(1074);
				match(T_CLOSE_B);
				setState(1075);
				end_for();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_forContext extends ParserRuleContext {
		public End_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnd_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnd_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnd_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_forContext end_for() throws RecognitionException {
		End_forContext _localctx = new End_forContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_end_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_typeContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(gParser.T_INT, 0); }
		public TerminalNode T_CHAR() { return getToken(gParser.T_CHAR, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public For_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFor_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_typeContext for_type() throws RecognitionException {
		For_typeContext _localctx = new For_typeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_for_type);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				match(T_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				match(T_CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1083);
				error();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(gParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(gParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(gParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(gParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(gParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(gParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(gParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(gParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(gParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_column_inline_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(1120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1089);
					match(T_NOT);
					}
				}

				setState(1092);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1093);
				match(T_PRIMARY);
				setState(1094);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1095);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1096);
				match(T_REFERENCES);
				setState(1097);
				table_name();
				setState(1098);
				match(T_OPEN_P);
				setState(1099);
				ident();
				setState(1100);
				match(T_CLOSE_P);
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1101);
					create_table_fk_action();
					}
					}
					setState(1106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1107);
				match(T_IDENTITY);
				setState(1108);
				match(T_OPEN_P);
				setState(1109);
				match(L_INT);
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1110);
					match(T_COMMA);
					setState(1111);
					match(L_INT);
					}
					}
					setState(1116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1117);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1118);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1119);
				match(T_ENABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(gParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(gParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(gParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(gParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(gParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(gParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(gParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(gParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(gParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(gParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_column_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_table_column_cons);
		int _la;
		try {
			setState(1179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				match(T_PRIMARY);
				setState(1123);
				match(T_KEY);
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1124);
					match(T_CLUSTERED);
					}
				}

				setState(1127);
				match(T_OPEN_P);
				setState(1128);
				ident();
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1129);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1132);
					match(T_COMMA);
					setState(1133);
					ident();
					setState(1135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1134);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(1141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1142);
				match(T_CLOSE_P);
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(1143);
					match(T_ENABLE);
					}
				}

				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1146);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
				match(T_FOREIGN);
				setState(1150);
				match(T_KEY);
				setState(1151);
				match(T_OPEN_P);
				setState(1152);
				ident();
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1153);
					match(T_COMMA);
					setState(1154);
					ident();
					}
					}
					setState(1159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1160);
				match(T_CLOSE_P);
				setState(1161);
				match(T_REFERENCES);
				setState(1162);
				table_name();
				setState(1163);
				match(T_OPEN_P);
				setState(1164);
				ident();
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1165);
					match(T_COMMA);
					setState(1166);
					ident();
					}
					}
					setState(1171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1172);
				match(T_CLOSE_P);
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1173);
					create_table_fk_action();
					}
					}
					setState(1178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(gParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(gParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(gParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(gParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(gParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(gParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_fk_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(T_ON);
			setState(1182);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(1183);
				match(T_NO);
				setState(1184);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(1185);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(1186);
				match(T_SET);
				setState(1187);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(1188);
				match(T_SET);
				setState(1189);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(1190);
				match(T_CASCADE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_preoptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1193);
				create_table_preoptions_item();
				}
				}
				setState(1196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_preoptions_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_create_table_preoptions_item);
		try {
			setState(1201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				match(T_COMMA);
				setState(1199);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200);
				create_table_options_hive_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(gParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(gParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(gParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_preoptions_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(1203);
				match(T_NO);
				}
			}

			setState(1206);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_optionsContext extends ParserRuleContext {
		public TerminalNode T_LOCATION() { return getToken(gParser.T_LOCATION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_table_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(T_LOCATION);
			setState(1209);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_edContext extends ParserRuleContext {
		public Create_table_options_itemContext create_table_options_item() {
			return getRuleContext(Create_table_options_itemContext.class,0);
		}
		public Create_table_options_edContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_ed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_ed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_ed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_edContext create_table_options_ed() throws RecognitionException {
		Create_table_options_edContext _localctx = new Create_table_options_edContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_create_table_options_ed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			create_table_options_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(gParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(gParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(gParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(gParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_table_options_item);
		int _la;
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				match(T_ON);
				setState(1214);
				match(T_COMMIT);
				setState(1215);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1216);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1218);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1219);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1220);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1221);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1222);
				create_table_options_mysql_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(gParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(gParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(gParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(gParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(gParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(gParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(gParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(gParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(gParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(gParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(gParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(gParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(gParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(gParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(gParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_ora_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(1243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				match(T_SEGMENT);
				setState(1226);
				match(T_CREATION);
				setState(1227);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1229);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1230);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1231);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1232);
				match(T_STORAGE);
				setState(1233);
				match(T_OPEN_P);
				setState(1236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1236);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case L_ID:
						{
						setState(1234);
						ident();
						}
						break;
					case L_INT:
						{
						setState(1235);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CREATOR - 64)) | (1L << (T_CS - 64)) | (1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_GRANT - 128)) | (1L << (T_GROUP - 128)) | (1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOUNT - 192)) | (1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)) | (1L << (L_INT - 320)))) != 0) );
				setState(1240);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1241);
				match(T_TABLESPACE);
				setState(1242);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(gParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(gParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(gParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(gParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(gParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(gParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(gParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(gParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(gParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(gParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(gParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_db2_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1245);
					match(T_INDEX);
					}
				}

				setState(1248);
				match(T_IN);
				setState(1249);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				match(T_WITH);
				setState(1251);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1252);
				match(T_DISTRIBUTE);
				setState(1253);
				match(T_BY);
				setState(1254);
				match(T_HASH);
				setState(1255);
				match(T_OPEN_P);
				setState(1256);
				ident();
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1257);
					match(T_COMMA);
					setState(1258);
					ident();
					}
					}
					setState(1263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1264);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1266);
					match(T_NOT);
					}
				}

				setState(1269);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1270);
				match(T_COMPRESS);
				setState(1271);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1272);
				match(T_DEFINITION);
				setState(1273);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1274);
				match(T_WITH);
				setState(1275);
				match(T_RESTRICT);
				setState(1276);
				match(T_ON);
				setState(1277);
				match(T_DROP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(gParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(gParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(gParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(gParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(1298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1280);
					match(T_UNIQUE);
					}
				}

				setState(1283);
				match(T_PRIMARY);
				setState(1284);
				match(T_INDEX);
				setState(1285);
				match(T_OPEN_P);
				setState(1286);
				ident();
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1287);
					match(T_COMMA);
					setState(1288);
					ident();
					}
					}
					setState(1293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1294);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				match(T_WITH);
				setState(1297);
				match(T_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_hive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_create_table_options_hive_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			create_table_hive_row_format();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(gParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(gParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(gParser.T_DELIMITED, 0); }
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,0);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_hive_row_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_create_table_hive_row_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(T_ROW);
			setState(1303);
			match(T_FORMAT);
			setState(1304);
			match(T_DELIMITED);
			setState(1305);
			create_table_hive_row_format_fields();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(gParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(gParser.T_TERMINATED, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLLECTION() { return getToken(gParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(gParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(gParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(gParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(gParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(gParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_table_hive_row_format_fields);
		try {
			setState(1329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307);
				match(T_FIELDS);
				setState(1308);
				match(T_TERMINATED);
				setState(1309);
				match(T_BY);
				setState(1310);
				expr(0);
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				match(T_COLLECTION);
				setState(1312);
				match(T_ITEMS);
				setState(1313);
				match(T_TERMINATED);
				setState(1314);
				match(T_BY);
				setState(1315);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1316);
				match(T_MAP);
				setState(1317);
				match(T_KEYS);
				setState(1318);
				match(T_TERMINATED);
				setState(1319);
				match(T_BY);
				setState(1320);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1321);
				match(T_LINES);
				setState(1322);
				match(T_TERMINATED);
				setState(1323);
				match(T_BY);
				setState(1324);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1325);
				match(T_NULL);
				setState(1326);
				match(T_DEFINED);
				setState(1327);
				match(T_AS);
				setState(1328);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(gParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_mssql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_create_table_options_mssql_item);
		try {
			setState(1335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				match(T_ON);
				setState(1332);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				match(T_TEXTIMAGE_ON);
				setState(1334);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(gParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(gParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(gParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(gParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(gParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(gParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_mysql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				match(T_AUTO_INCREMENT);
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1338);
					match(T_EQUAL);
					}
				}

				setState(1341);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				match(T_COMMENT);
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1343);
					match(T_EQUAL);
					}
				}

				setState(1346);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1347);
					match(T_DEFAULT);
					}
				}

				setState(1353);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1350);
					match(T_CHARACTER);
					setState(1351);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1352);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1355);
					match(T_EQUAL);
					}
				}

				setState(1358);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1359);
				match(T_ENGINE);
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1360);
					match(T_EQUAL);
					}
				}

				setState(1363);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_table_itemContext alter_table_item() {
			return getRuleContext(Alter_table_itemContext.class,0);
		}
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			match(T_ALTER);
			setState(1367);
			match(T_TABLE);
			setState(1368);
			table_name();
			setState(1369);
			alter_table_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_itemContext extends ParserRuleContext {
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public Alter_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAlter_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAlter_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAlter_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_itemContext alter_table_item() throws RecognitionException {
		Alter_table_itemContext _localctx = new Alter_table_itemContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_alter_table_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			alter_table_add_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode T_ADD2() { return getToken(gParser.T_ADD2, 0); }
		public Alter_table_add_constraint_itemContext alter_table_add_constraint_item() {
			return getRuleContext(Alter_table_add_constraint_itemContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(gParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_alter_table_add_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(T_ADD2);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CONSTRAINT) {
				{
				setState(1374);
				match(T_CONSTRAINT);
				setState(1375);
				ident();
				}
			}

			setState(1378);
			alter_table_add_constraint_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraint_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(gParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(gParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(gParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(gParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(gParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(gParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(gParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(gParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(gParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(gParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_DEFAULT() { return getToken(gParser.T_DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public Alter_table_add_constraint_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAlter_table_add_constraint_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAlter_table_add_constraint_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAlter_table_add_constraint_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraint_itemContext alter_table_add_constraint_item() throws RecognitionException {
		Alter_table_add_constraint_itemContext _localctx = new Alter_table_add_constraint_itemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_alter_table_add_constraint_item);
		int _la;
		try {
			int _alt;
			setState(1442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1380);
				match(T_PRIMARY);
				setState(1381);
				match(T_KEY);
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1382);
					match(T_CLUSTERED);
					}
				}

				setState(1385);
				match(T_OPEN_P);
				setState(1386);
				ident();
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1387);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1390);
					match(T_COMMA);
					setState(1391);
					ident();
					setState(1393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1392);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(1399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1400);
				match(T_CLOSE_P);
				setState(1402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1401);
					match(T_ENABLE);
					}
					break;
				}
				setState(1405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1404);
					index_storage_clause();
					}
					break;
				}
				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1407);
				match(T_FOREIGN);
				setState(1408);
				match(T_KEY);
				setState(1409);
				match(T_OPEN_P);
				setState(1410);
				ident();
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1411);
					match(T_COMMA);
					setState(1412);
					ident();
					}
					}
					setState(1417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1418);
				match(T_CLOSE_P);
				setState(1419);
				match(T_REFERENCES);
				setState(1420);
				table_name();
				setState(1421);
				match(T_OPEN_P);
				setState(1422);
				ident();
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1423);
					match(T_COMMA);
					setState(1424);
					ident();
					}
					}
					setState(1429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1430);
				match(T_CLOSE_P);
				setState(1434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1431);
						create_table_fk_action();
						}
						} 
					}
					setState(1436);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				}
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1437);
				match(T_DEFAULT);
				setState(1438);
				expr(0);
				setState(1439);
				match(T_FOR);
				setState(1440);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(gParser.T_CHAR, 0); }
		public TerminalNode T_BIGINT() { return getToken(gParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(gParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(gParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(gParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(gParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(gParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(gParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(gParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(gParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(gParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(gParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(gParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(gParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(gParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(gParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(gParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(gParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(gParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(gParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(gParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(gParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(gParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(gParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(gParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(gParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(gParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(gParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(gParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(gParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(gParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(gParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(gParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(gParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(gParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(gParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(gParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(gParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(gParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(gParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dtype);
		int _la;
		try {
			setState(1489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1445);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1446);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1447);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1448);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1449);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1450);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1451);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1452);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1453);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1454);
				match(T_DOUBLE);
				setState(1456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1455);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1458);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1459);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1460);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1461);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1462);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1463);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1464);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1465);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1466);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1467);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1468);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1469);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1470);
				match(T_RESULT_SET_LOCATOR);
				setState(1471);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1472);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1473);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1474);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1475);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1476);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1477);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1478);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1479);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1480);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1481);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1482);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1483);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1484);
				ident();
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1485);
					match(T__2);
					setState(1486);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(gParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(gParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(gParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(gParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(gParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDtype_len(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(T_OPEN_P);
			setState(1492);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1493);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1496);
				match(T_COMMA);
				setState(1497);
				match(L_INT);
				}
			}

			setState(1500);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(gParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(gParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(gParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDtype_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_dtype_attr);
		int _la;
		try {
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1502);
					match(T_NOT);
					}
				}

				setState(1505);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1506);
				match(T_CHARACTER);
				setState(1507);
				match(T_SET);
				setState(1508);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1509);
					match(T_NOT);
					}
				}

				setState(1512);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(gParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(gParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDtype_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_dtype_default);
		int _la;
		try {
			setState(1527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1515);
					match(T_COLON);
					}
				}

				setState(1518);
				match(T_EQUAL);
				setState(1519);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1520);
					match(T_WITH);
					}
				}

				setState(1523);
				match(T_DEFAULT);
				setState(1525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1524);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(gParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(gParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(gParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			match(T_CREATE);
			setState(1530);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1531);
				match(T_IF);
				setState(1532);
				match(T_NOT);
				setState(1533);
				match(T_EXISTS);
				}
				break;
			}
			setState(1536);
			expr(0);
			setState(1540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1537);
					create_database_option();
					}
					} 
				}
				setState(1542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(gParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(gParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_database_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_database_option);
		try {
			setState(1547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1543);
				match(T_COMMENT);
				setState(1544);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				match(T_LOCATION);
				setState(1546);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(gParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1549);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1550);
				match(T_CREATE);
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1551);
					match(T_OR);
					setState(1552);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1555);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1558);
			match(T_FUNCTION);
			setState(1559);
			ident();
			setState(1561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1560);
				create_routine_params();
				}
				break;
			}
			setState(1563);
			create_function_return();
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1564);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1567);
				declare_block_inplace();
				}
				break;
			}
			setState(1570);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(gParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_function_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1573);
			dtype();
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1574);
				dtype_len();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(gParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_package_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1577);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1578);
				match(T_CREATE);
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1579);
					match(T_OR);
					setState(1580);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1583);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1586);
			match(T_PACKAGE);
			setState(1587);
			ident();
			setState(1588);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1589);
			package_spec();
			setState(1590);
			match(T_END);
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1591);
				ident();
				setState(1592);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPackage_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			package_spec_item();
			setState(1597);
			match(T_SEMICOLON);
			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CREATOR - 64)) | (1L << (T_CS - 64)) | (1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_GRANT - 128)) | (1L << (T_GROUP - 128)) | (1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOUNT - 192)) | (1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1598);
				package_spec_item();
				setState(1599);
				match(T_SEMICOLON);
				}
				}
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(gParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(gParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(gParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPackage_spec_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_package_spec_item);
		int _la;
		try {
			setState(1619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
				match(T_FUNCTION);
				setState(1608);
				ident();
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1609);
					create_routine_params();
					}
					break;
				}
				setState(1612);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1614);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1615);
				ident();
				setState(1617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1616);
					create_routine_params();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(gParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(gParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_package_body_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1621);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1622);
				match(T_CREATE);
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1623);
					match(T_OR);
					setState(1624);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1627);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1630);
			match(T_PACKAGE);
			setState(1631);
			match(T_BODY);
			setState(1632);
			ident();
			setState(1633);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1634);
			package_body();
			setState(1635);
			match(T_END);
			setState(1639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1636);
				ident();
				setState(1637);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			package_body_item();
			setState(1642);
			match(T_SEMICOLON);
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CREATOR - 64)) | (1L << (T_CS - 64)) | (1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_GRANT - 128)) | (1L << (T_GROUP - 128)) | (1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOUNT - 192)) | (1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1643);
				package_body_item();
				setState(1644);
				match(T_SEMICOLON);
				}
				}
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPackage_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_package_body_item);
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1651);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1653);
				create_procedure_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(gParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(gParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_procedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1656);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1657);
				match(T_CREATE);
				setState(1660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1658);
					match(T_OR);
					setState(1659);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1662);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1665);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1666);
			ident();
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1667);
				create_routine_params();
				}
				break;
			}
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1670);
				create_routine_options();
				}
				break;
			}
			setState(1674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1673);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1676);
				declare_block_inplace();
				}
				break;
			}
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1679);
				label();
				}
				break;
			}
			setState(1682);
			proc_block();
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1683);
				ident();
				setState(1684);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_routine_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688);
				match(T_OPEN_P);
				setState(1689);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1690);
				match(T_OPEN_P);
				setState(1691);
				create_routine_param_item();
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1692);
					match(T_COMMA);
					setState(1693);
					create_routine_param_item();
					}
					}
					setState(1698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1699);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1701);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1702);
				create_routine_param_item();
				setState(1707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1703);
						match(T_COMMA);
						setState(1704);
						create_routine_param_item();
						}
						} 
					}
					setState(1709);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(gParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(gParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_routine_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1712);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1713);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1714);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1715);
					match(T_IN);
					setState(1716);
					match(T_OUT);
					}
					break;
				}
				setState(1719);
				ident();
				setState(1720);
				dtype();
				setState(1722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1721);
					dtype_len();
					}
					break;
				}
				setState(1727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1724);
						dtype_attr();
						}
						} 
					}
					setState(1729);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				setState(1731);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1730);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				ident();
				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1734);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1735);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1736);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1737);
					match(T_IN);
					setState(1738);
					match(T_OUT);
					}
					break;
				}
				setState(1741);
				dtype();
				setState(1743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1742);
					dtype_len();
					}
					break;
				}
				setState(1748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1745);
						dtype_attr();
						}
						} 
					}
					setState(1750);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1751);
					dtype_default();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_routine_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1757); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1756);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1759); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(gParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(gParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(gParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(gParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(gParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(gParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(gParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(gParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(gParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(gParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(gParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_routine_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_create_routine_option);
		int _la;
		try {
			setState(1772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1761);
				match(T_LANGUAGE);
				setState(1762);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
				match(T_SQL);
				setState(1764);
				match(T_SECURITY);
				setState(1765);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1766);
					match(T_DYNAMIC);
					}
				}

				setState(1769);
				match(T_RESULT);
				setState(1770);
				match(T_SETS);
				setState(1771);
				match(L_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_stmtContext extends ParserRuleContext {
		public TerminalNode T_DROP() { return getToken(gParser.T_DROP, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public TerminalNode T_EXISTS() { return getToken(gParser.T_EXISTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(gParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(gParser.T_SCHEMA, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDrop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_drop_stmt);
		int _la;
		try {
			setState(1788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1774);
				match(T_DROP);
				setState(1775);
				match(T_TABLE);
				setState(1778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1776);
					match(T_IF);
					setState(1777);
					match(T_EXISTS);
					}
					break;
				}
				setState(1780);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1781);
				match(T_DROP);
				setState(1782);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1783);
					match(T_IF);
					setState(1784);
					match(T_EXISTS);
					}
					break;
				}
				setState(1787);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(gParser.T_TRANSACTION, 0); }
		public End_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnd_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnd_transaction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnd_transaction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_transaction_stmtContext end_transaction_stmt() throws RecognitionException {
		End_transaction_stmtContext _localctx = new End_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_end_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			match(T_END);
			setState(1791);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exec_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EXEC() { return getToken(gParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(gParser.T_EXECUTE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(gParser.T_IMMEDIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public List<TerminalNode> L_ID() { return getTokens(gParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(gParser.L_ID, i);
		}
		public Using_clauseContext using_clause() {
			return getRuleContext(Using_clauseContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExec_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1794);
				match(T_IMMEDIATE);
				}
				break;
			}
			setState(1797);
			expr(0);
			setState(1803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1798);
				match(T_OPEN_P);
				setState(1799);
				expr_func_params();
				setState(1800);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1802);
				expr_func_params();
				}
				break;
			}
			setState(1814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1805);
				match(T_INTO);
				setState(1806);
				match(L_ID);
				setState(1811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1807);
						match(T_COMMA);
						setState(1808);
						match(L_ID);
						}
						} 
					}
					setState(1813);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				}
				break;
			}
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1816);
				using_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_if_stmt);
		try {
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1819);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1820);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1821);
				if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(gParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(gParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public End_ifContext end_if() {
			return getRuleContext(End_ifContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_plsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			match(T_IF);
			setState(1825);
			bool_expr(0);
			setState(1826);
			match(T_THEN);
			setState(1827);
			match(T_OPEN_B);
			setState(1828);
			block();
			setState(1829);
			match(T_CLOSE_B);
			setState(1830);
			end_if();
			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1831);
				elseif_block();
				}
				}
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1837);
				else_block();
				}
			}

			setState(1840);
			match(T_END);
			setState(1841);
			match(T_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_ifContext extends ParserRuleContext {
		public End_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnd_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnd_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnd_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_ifContext end_if() throws RecognitionException {
		End_ifContext _localctx = new End_ifContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_end_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_tsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(T_IF);
			setState(1846);
			bool_expr(0);
			setState(1847);
			single_block_stmt();
			setState(1850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1848);
				match(T_ELSE);
				setState(1849);
				single_block_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_bteq_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(T__3);
			setState(1853);
			match(T_IF);
			setState(1854);
			bool_expr(0);
			setState(1855);
			match(T_THEN);
			setState(1856);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(gParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(gParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElseif_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1859);
			bool_expr(0);
			setState(1860);
			match(T_THEN);
			setState(1861);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			match(T_ELSE);
			setState(1864);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Include_stmtContext extends ParserRuleContext {
		public TerminalNode T_INCLUDE() { return getToken(gParser.T_INCLUDE, 0); }
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Include_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInclude_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInclude_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInclude_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_stmtContext include_stmt() throws RecognitionException {
		Include_stmtContext _localctx = new Include_stmtContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_include_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(T_INCLUDE);
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1867);
				file_name();
				}
				break;
			case 2:
				{
				setState(1868);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(gParser.T_INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OVERWRITE() { return getToken(gParser.T_OVERWRITE, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmt_rowsContext insert_stmt_rows() {
			return getRuleContext(Insert_stmt_rowsContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			match(T_INSERT);
			setState(1878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_OVERWRITE:
				{
				setState(1872);
				match(T_OVERWRITE);
				setState(1873);
				match(T_TABLE);
				}
				break;
			case T_INTO:
				{
				setState(1874);
				match(T_INTO);
				setState(1876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1875);
					match(T_TABLE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1880);
			table_name();
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1881);
				insert_stmt_cols();
				}
				break;
			}
			setState(1886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				{
				setState(1884);
				select_stmt();
				}
				break;
			case T_VALUES:
				{
				setState(1885);
				insert_stmt_rows();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Insert_stmt_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInsert_stmt_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInsert_stmt_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInsert_stmt_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_colsContext insert_stmt_cols() throws RecognitionException {
		Insert_stmt_colsContext _localctx = new Insert_stmt_colsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_insert_stmt_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			match(T_OPEN_P);
			setState(1889);
			ident();
			setState(1894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1890);
				match(T_COMMA);
				setState(1891);
				ident();
				}
				}
				setState(1896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1897);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_rowsContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(gParser.T_VALUES, 0); }
		public List<Insert_stmt_rowContext> insert_stmt_row() {
			return getRuleContexts(Insert_stmt_rowContext.class);
		}
		public Insert_stmt_rowContext insert_stmt_row(int i) {
			return getRuleContext(Insert_stmt_rowContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Insert_stmt_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInsert_stmt_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInsert_stmt_rows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInsert_stmt_rows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_rowsContext insert_stmt_rows() throws RecognitionException {
		Insert_stmt_rowsContext _localctx = new Insert_stmt_rowsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_insert_stmt_rows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			match(T_VALUES);
			setState(1900);
			insert_stmt_row();
			setState(1905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1901);
					match(T_COMMA);
					setState(1902);
					insert_stmt_row();
					}
					} 
				}
				setState(1907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_rowContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Insert_stmt_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInsert_stmt_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInsert_stmt_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInsert_stmt_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_rowContext insert_stmt_row() throws RecognitionException {
		Insert_stmt_rowContext _localctx = new Insert_stmt_rowContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_insert_stmt_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			match(T_OPEN_P);
			setState(1909);
			expr(0);
			setState(1914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1910);
				match(T_COMMA);
				setState(1911);
				expr(0);
				}
				}
				setState(1916);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1917);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_directory_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(gParser.T_INSERT, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(gParser.T_OVERWRITE, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(gParser.T_DIRECTORY, 0); }
		public Expr_fileContext expr_file() {
			return getRuleContext(Expr_fileContext.class,0);
		}
		public Expr_selectContext expr_select() {
			return getRuleContext(Expr_selectContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(gParser.T_LOCAL, 0); }
		public Insert_directory_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_directory_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInsert_directory_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInsert_directory_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInsert_directory_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_directory_stmtContext insert_directory_stmt() throws RecognitionException {
		Insert_directory_stmtContext _localctx = new Insert_directory_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_insert_directory_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			match(T_INSERT);
			setState(1920);
			match(T_OVERWRITE);
			setState(1922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCAL) {
				{
				setState(1921);
				match(T_LOCAL);
				}
			}

			setState(1924);
			match(T_DIRECTORY);
			setState(1925);
			expr_file();
			setState(1926);
			expr_select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode T_EXIT() { return getToken(gParser.T_EXIT, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_WHEN() { return getToken(gParser.T_WHEN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			match(T_EXIT);
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1929);
				match(L_ID);
				}
				break;
			}
			setState(1934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1932);
				match(T_WHEN);
				setState(1933);
				bool_expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmtContext extends ParserRuleContext {
		public TerminalNode T_GET() { return getToken(gParser.T_GET, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(gParser.T_DIAGNOSTICS, 0); }
		public Get_diag_stmt_itemContext get_diag_stmt_item() {
			return getRuleContext(Get_diag_stmt_itemContext.class,0);
		}
		public Get_diag_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGet_diag_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGet_diag_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGet_diag_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmtContext get_diag_stmt() throws RecognitionException {
		Get_diag_stmtContext _localctx = new Get_diag_stmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_get_diag_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			match(T_GET);
			setState(1937);
			match(T_DIAGNOSTICS);
			setState(1938);
			get_diag_stmt_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_itemContext extends ParserRuleContext {
		public Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() {
			return getRuleContext(Get_diag_stmt_exception_itemContext.class,0);
		}
		public Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() {
			return getRuleContext(Get_diag_stmt_rowcount_itemContext.class,0);
		}
		public Get_diag_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGet_diag_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGet_diag_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGet_diag_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_itemContext get_diag_stmt_item() throws RecognitionException {
		Get_diag_stmt_itemContext _localctx = new Get_diag_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_get_diag_stmt_item);
		try {
			setState(1942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1940);
				get_diag_stmt_exception_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				get_diag_stmt_rowcount_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_exception_itemContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(gParser.T_EXCEPTION, 0); }
		public TerminalNode L_INT() { return getToken(gParser.L_INT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(gParser.T_MESSAGE_TEXT, 0); }
		public Get_diag_stmt_exception_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_exception_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGet_diag_stmt_exception_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGet_diag_stmt_exception_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGet_diag_stmt_exception_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() throws RecognitionException {
		Get_diag_stmt_exception_itemContext _localctx = new Get_diag_stmt_exception_itemContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_get_diag_stmt_exception_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			match(T_EXCEPTION);
			setState(1945);
			match(L_INT);
			setState(1946);
			ident();
			setState(1947);
			match(T_EQUAL);
			setState(1948);
			match(T_MESSAGE_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_rowcount_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(gParser.T_ROW_COUNT, 0); }
		public Get_diag_stmt_rowcount_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_rowcount_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGet_diag_stmt_rowcount_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGet_diag_stmt_rowcount_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGet_diag_stmt_rowcount_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() throws RecognitionException {
		Get_diag_stmt_rowcount_itemContext _localctx = new Get_diag_stmt_rowcount_itemContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_get_diag_stmt_rowcount_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			ident();
			setState(1951);
			match(T_EQUAL);
			setState(1952);
			match(T_ROW_COUNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_stmtContext extends ParserRuleContext {
		public TerminalNode T_GRANT() { return getToken(gParser.T_GRANT, 0); }
		public List<Grant_stmt_itemContext> grant_stmt_item() {
			return getRuleContexts(Grant_stmt_itemContext.class);
		}
		public Grant_stmt_itemContext grant_stmt_item(int i) {
			return getRuleContext(Grant_stmt_itemContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(gParser.T_TO, 0); }
		public TerminalNode T_ROLE() { return getToken(gParser.T_ROLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Grant_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGrant_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGrant_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGrant_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_stmtContext grant_stmt() throws RecognitionException {
		Grant_stmtContext _localctx = new Grant_stmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_grant_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			match(T_GRANT);
			setState(1955);
			grant_stmt_item();
			setState(1960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1956);
				match(T_COMMA);
				setState(1957);
				grant_stmt_item();
				}
				}
				setState(1962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1963);
			match(T_TO);
			setState(1964);
			match(T_ROLE);
			setState(1965);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_stmt_itemContext extends ParserRuleContext {
		public TerminalNode T_EXECUTE() { return getToken(gParser.T_EXECUTE, 0); }
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(gParser.T_PROCEDURE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Grant_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGrant_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGrant_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGrant_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_stmt_itemContext grant_stmt_item() throws RecognitionException {
		Grant_stmt_itemContext _localctx = new Grant_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_grant_stmt_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			match(T_EXECUTE);
			setState(1968);
			match(T_ON);
			setState(1969);
			match(T_PROCEDURE);
			setState(1970);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Leave_stmtContext extends ParserRuleContext {
		public TerminalNode T_LEAVE() { return getToken(gParser.T_LEAVE, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public Leave_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leave_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLeave_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLeave_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLeave_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leave_stmtContext leave_stmt() throws RecognitionException {
		Leave_stmtContext _localctx = new Leave_stmtContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(T_LEAVE);
			setState(1974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1973);
				match(L_ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_object_stmtContext extends ParserRuleContext {
		public TerminalNode T_MAP() { return getToken(gParser.T_MAP, 0); }
		public TerminalNode T_OBJECT() { return getToken(gParser.T_OBJECT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(gParser.T_TO, 0); }
		public TerminalNode T_AT() { return getToken(gParser.T_AT, 0); }
		public Map_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_object_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMap_object_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMap_object_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMap_object_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_object_stmtContext map_object_stmt() throws RecognitionException {
		Map_object_stmtContext _localctx = new Map_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_map_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			match(T_MAP);
			setState(1977);
			match(T_OBJECT);
			setState(1978);
			expr(0);
			setState(1981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1979);
				match(T_TO);
				setState(1980);
				expr(0);
				}
				break;
			}
			setState(1985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1983);
				match(T_AT);
				setState(1984);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_stmtContext extends ParserRuleContext {
		public TerminalNode T_OPEN() { return getToken(gParser.T_OPEN, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Open_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOpen_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOpen_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOpen_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_stmtContext open_stmt() throws RecognitionException {
		Open_stmtContext _localctx = new Open_stmtContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_open_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			match(T_OPEN);
			setState(1988);
			match(L_ID);
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1989);
				match(T_FOR);
				setState(1992);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1990);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1991);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_stmtContext extends ParserRuleContext {
		public TerminalNode T_FETCH() { return getToken(gParser.T_FETCH, 0); }
		public List<TerminalNode> L_ID() { return getTokens(gParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(gParser.L_ID, i);
		}
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public TerminalNode T_FROM() { return getToken(gParser.T_FROM, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Fetch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFetch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFetch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFetch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_stmtContext fetch_stmt() throws RecognitionException {
		Fetch_stmtContext _localctx = new Fetch_stmtContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_fetch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			match(T_FETCH);
			setState(1998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_FROM) {
				{
				setState(1997);
				match(T_FROM);
				}
			}

			setState(2000);
			match(L_ID);
			setState(2001);
			match(T_INTO);
			setState(2002);
			match(L_ID);
			setState(2007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2003);
					match(T_COMMA);
					setState(2004);
					match(L_ID);
					}
					} 
				}
				setState(2009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collect_stats_stmtContext extends ParserRuleContext {
		public TerminalNode T_COLLECT() { return getToken(gParser.T_COLLECT, 0); }
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_STATISTICS() { return getToken(gParser.T_STATISTICS, 0); }
		public TerminalNode T_STATS() { return getToken(gParser.T_STATS, 0); }
		public Collect_stats_clauseContext collect_stats_clause() {
			return getRuleContext(Collect_stats_clauseContext.class,0);
		}
		public Collect_stats_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCollect_stats_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCollect_stats_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCollect_stats_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collect_stats_stmtContext collect_stats_stmt() throws RecognitionException {
		Collect_stats_stmtContext _localctx = new Collect_stats_stmtContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_collect_stats_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			match(T_COLLECT);
			setState(2011);
			_la = _input.LA(1);
			if ( !(_la==T_STATS || _la==T_STATISTICS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2012);
			match(T_ON);
			setState(2013);
			table_name();
			setState(2015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(2014);
				collect_stats_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collect_stats_clauseContext extends ParserRuleContext {
		public TerminalNode T_COLUMN() { return getToken(gParser.T_COLUMN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Collect_stats_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCollect_stats_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCollect_stats_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCollect_stats_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collect_stats_clauseContext collect_stats_clause() throws RecognitionException {
		Collect_stats_clauseContext _localctx = new Collect_stats_clauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_collect_stats_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2017);
			match(T_COLUMN);
			setState(2018);
			match(T_OPEN_P);
			setState(2019);
			ident();
			setState(2024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2020);
				match(T_COMMA);
				setState(2021);
				ident();
				}
				}
				setState(2026);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2027);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_stmtContext extends ParserRuleContext {
		public TerminalNode T_CLOSE() { return getToken(gParser.T_CLOSE, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterClose_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitClose_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitClose_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			match(T_CLOSE);
			setState(2030);
			match(L_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_stmtContext extends ParserRuleContext {
		public TerminalNode T_CMP() { return getToken(gParser.T_CMP, 0); }
		public List<Cmp_sourceContext> cmp_source() {
			return getRuleContexts(Cmp_sourceContext.class);
		}
		public Cmp_sourceContext cmp_source(int i) {
			return getRuleContext(Cmp_sourceContext.class,i);
		}
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(gParser.T_ROW_COUNT, 0); }
		public TerminalNode T_SUM() { return getToken(gParser.T_SUM, 0); }
		public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCmp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCmp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCmp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
			match(T_CMP);
			setState(2033);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2034);
			cmp_source();
			setState(2035);
			match(T_COMMA);
			setState(2036);
			cmp_source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_sourceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_AT() { return getToken(gParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCmp_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCmp_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCmp_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(2038);
				table_name();
				setState(2040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(2039);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(2042);
				match(T_OPEN_P);
				setState(2043);
				select_stmt();
				setState(2044);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(2048);
				match(T_AT);
				setState(2049);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_from_local_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(gParser.T_COPY, 0); }
		public TerminalNode T_FROM() { return getToken(gParser.T_FROM, 0); }
		public TerminalNode T_LOCAL() { return getToken(gParser.T_LOCAL, 0); }
		public List<Copy_sourceContext> copy_source() {
			return getRuleContexts(Copy_sourceContext.class);
		}
		public Copy_sourceContext copy_source(int i) {
			return getRuleContext(Copy_sourceContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(gParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public List<Copy_file_optionContext> copy_file_option() {
			return getRuleContexts(Copy_file_optionContext.class);
		}
		public Copy_file_optionContext copy_file_option(int i) {
			return getRuleContext(Copy_file_optionContext.class,i);
		}
		public Copy_from_local_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_from_local_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCopy_from_local_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCopy_from_local_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCopy_from_local_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_from_local_stmtContext copy_from_local_stmt() throws RecognitionException {
		Copy_from_local_stmtContext _localctx = new Copy_from_local_stmtContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_copy_from_local_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			match(T_COPY);
			setState(2053);
			match(T_FROM);
			setState(2054);
			match(T_LOCAL);
			setState(2055);
			copy_source();
			setState(2060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2056);
				match(T_COMMA);
				setState(2057);
				copy_source();
				}
				}
				setState(2062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2063);
			match(T_TO);
			setState(2064);
			copy_target();
			setState(2068);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2065);
					copy_file_option();
					}
					} 
				}
				setState(2070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(gParser.T_COPY, 0); }
		public TerminalNode T_TO() { return getToken(gParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_HDFS() { return getToken(gParser.T_HDFS, 0); }
		public List<Copy_optionContext> copy_option() {
			return getRuleContexts(Copy_optionContext.class);
		}
		public Copy_optionContext copy_option(int i) {
			return getRuleContext(Copy_optionContext.class,i);
		}
		public Copy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCopy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCopy_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCopy_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_stmtContext copy_stmt() throws RecognitionException {
		Copy_stmtContext _localctx = new Copy_stmtContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_copy_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			match(T_COPY);
			setState(2077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(2072);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				setState(2073);
				match(T_OPEN_P);
				setState(2074);
				select_stmt();
				setState(2075);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2079);
			match(T_TO);
			setState(2081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2080);
				match(T_HDFS);
				}
				break;
			}
			setState(2083);
			copy_target();
			setState(2087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2084);
					copy_option();
					}
					} 
				}
				setState(2089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_sourceContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCopy_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCopy_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCopy_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_sourceContext copy_source() throws RecognitionException {
		Copy_sourceContext _localctx = new Copy_sourceContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_copy_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(2090);
				file_name();
				}
				break;
			case 2:
				{
				setState(2091);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_targetContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCopy_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCopy_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCopy_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_targetContext copy_target() throws RecognitionException {
		Copy_targetContext _localctx = new Copy_targetContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_copy_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(2094);
				file_name();
				}
				break;
			case 2:
				{
				setState(2095);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_optionContext extends ParserRuleContext {
		public TerminalNode T_AT() { return getToken(gParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_BATCHSIZE() { return getToken(gParser.T_BATCHSIZE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DELIMITER() { return getToken(gParser.T_DELIMITER, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(gParser.T_SQLINSERT, 0); }
		public Copy_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCopy_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCopy_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCopy_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_optionContext copy_option() throws RecognitionException {
		Copy_optionContext _localctx = new Copy_optionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_copy_option);
		try {
			setState(2106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2098);
				match(T_AT);
				setState(2099);
				ident();
				}
				break;
			case T_BATCHSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2100);
				match(T_BATCHSIZE);
				setState(2101);
				expr(0);
				}
				break;
			case T_DELIMITER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2102);
				match(T_DELIMITER);
				setState(2103);
				expr(0);
				}
				break;
			case T_SQLINSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2104);
				match(T_SQLINSERT);
				setState(2105);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_file_optionContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(gParser.T_DELETE, 0); }
		public TerminalNode T_IGNORE() { return getToken(gParser.T_IGNORE, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(gParser.T_OVERWRITE, 0); }
		public Copy_file_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_file_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCopy_file_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCopy_file_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCopy_file_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_file_optionContext copy_file_option() throws RecognitionException {
		Copy_file_optionContext _localctx = new Copy_file_optionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_copy_file_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_IGNORE || _la==T_OVERWRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode T_COMMIT() { return getToken(gParser.T_COMMIT, 0); }
		public TerminalNode T_WORK() { return getToken(gParser.T_WORK, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_commit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			match(T_COMMIT);
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(2111);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(gParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(gParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			match(T_CREATE);
			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(2115);
				match(T_UNIQUE);
				}
			}

			setState(2118);
			match(T_INDEX);
			setState(2119);
			ident();
			setState(2120);
			match(T_ON);
			setState(2121);
			table_name();
			setState(2122);
			match(T_OPEN_P);
			setState(2123);
			create_index_col();
			setState(2128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2124);
				match(T_COMMA);
				setState(2125);
				create_index_col();
				}
				}
				setState(2130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2131);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(gParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(gParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_index_col(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			ident();
			setState(2135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(2134);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIndex_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2137);
			index_mssql_storage_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(gParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(gParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIndex_mssql_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_index_mssql_storage_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			match(T_WITH);
			setState(2140);
			match(T_OPEN_P);
			setState(2141);
			ident();
			setState(2142);
			match(T_EQUAL);
			setState(2143);
			ident();
			setState(2151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2144);
				match(T_COMMA);
				setState(2145);
				ident();
				setState(2146);
				match(T_EQUAL);
				setState(2147);
				ident();
				}
				}
				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2154);
			match(T_CLOSE_P);
			setState(2158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2155);
					create_table_options_mssql_item();
					}
					} 
				}
				setState(2160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode T_PRINT() { return getToken(gParser.T_PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_print_stmt);
		try {
			setState(2168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				match(T_PRINT);
				setState(2162);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2163);
				match(T_PRINT);
				setState(2164);
				match(T_OPEN_P);
				setState(2165);
				expr(0);
				setState(2166);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quit_stmtContext extends ParserRuleContext {
		public TerminalNode T_QUIT() { return getToken(gParser.T_QUIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Quit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterQuit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitQuit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitQuit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quit_stmtContext quit_stmt() throws RecognitionException {
		Quit_stmtContext _localctx = new Quit_stmtContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(2170);
				match(T__3);
				}
			}

			setState(2173);
			match(T_QUIT);
			setState(2175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(2174);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode T_RAISE() { return getToken(gParser.T_RAISE, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRaise_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRaise_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRaise_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_raise_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			match(T_RAISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resignal_stmtContext extends ParserRuleContext {
		public TerminalNode T_RESIGNAL() { return getToken(gParser.T_RESIGNAL, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(gParser.T_SQLSTATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_VALUE() { return getToken(gParser.T_VALUE, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(gParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public Resignal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resignal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterResignal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitResignal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitResignal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resignal_stmtContext resignal_stmt() throws RecognitionException {
		Resignal_stmtContext _localctx = new Resignal_stmtContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_resignal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			match(T_RESIGNAL);
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2180);
				match(T_SQLSTATE);
				setState(2182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2181);
					match(T_VALUE);
					}
					break;
				}
				setState(2184);
				expr(0);
				setState(2189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2185);
					match(T_SET);
					setState(2186);
					match(T_MESSAGE_TEXT);
					setState(2187);
					match(T_EQUAL);
					setState(2188);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			match(T_RETURN);
			setState(2195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2194);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode T_ROLLBACK() { return getToken(gParser.T_ROLLBACK, 0); }
		public TerminalNode T_WORK() { return getToken(gParser.T_WORK, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_rollback_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			match(T_ROLLBACK);
			setState(2199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(2198);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_session_optionContext extends ParserRuleContext {
		public Set_current_schema_optionContext set_current_schema_option() {
			return getRuleContext(Set_current_schema_optionContext.class,0);
		}
		public Set_mssql_session_optionContext set_mssql_session_option() {
			return getRuleContext(Set_mssql_session_optionContext.class,0);
		}
		public Set_teradata_session_optionContext set_teradata_session_option() {
			return getRuleContext(Set_teradata_session_optionContext.class,0);
		}
		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSet_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSet_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSet_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_session_optionContext set_session_option() throws RecognitionException {
		Set_session_optionContext _localctx = new Set_session_optionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_set_session_option);
		try {
			setState(2204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2201);
				set_current_schema_option();
				}
				break;
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_NOCOUNT:
			case T_QUOTED_IDENTIFIER:
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2202);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(2203);
				set_teradata_session_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(gParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_SCHEMA() { return getToken(gParser.T_SCHEMA, 0); }
		public TerminalNode T_CURRENT() { return getToken(gParser.T_CURRENT, 0); }
		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_current_schema_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSet_current_schema_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSet_current_schema_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSet_current_schema_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		Set_current_schema_optionContext _localctx = new Set_current_schema_optionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(2207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(2206);
					match(T_CURRENT);
					}
				}

				setState(2209);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(2210);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(2213);
				match(T_EQUAL);
				}
			}

			setState(2216);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() { return getToken(gParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(gParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(gParser.T_NOCOUNT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(gParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(gParser.T_XACT_ABORT, 0); }
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_OFF() { return getToken(gParser.T_OFF, 0); }
		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mssql_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSet_mssql_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSet_mssql_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSet_mssql_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		Set_mssql_session_optionContext _localctx = new Set_mssql_session_optionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2219);
			_la = _input.LA(1);
			if ( !(_la==T_OFF || _la==T_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() { return getToken(gParser.T_QUERY_BAND, 0); }
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(gParser.T_TRANSACTION, 0); }
		public TerminalNode T_SESSION() { return getToken(gParser.T_SESSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_NONE() { return getToken(gParser.T_NONE, 0); }
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_teradata_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSet_teradata_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSet_teradata_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSet_teradata_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		Set_teradata_session_optionContext _localctx = new Set_teradata_session_optionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			match(T_QUERY_BAND);
			setState(2222);
			match(T_EQUAL);
			setState(2225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2223);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2224);
				match(T_NONE);
				}
				break;
			}
			setState(2228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(2227);
				match(T_UPDATE);
				}
			}

			setState(2230);
			match(T_FOR);
			setState(2231);
			_la = _input.LA(1);
			if ( !(_la==T_SESSION || _la==T_TRANSACTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_stmtContext extends ParserRuleContext {
		public TerminalNode T_SIGNAL() { return getToken(gParser.T_SIGNAL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Signal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSignal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSignal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSignal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_stmtContext signal_stmt() throws RecognitionException {
		Signal_stmtContext _localctx = new Signal_stmtContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_signal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
			match(T_SIGNAL);
			setState(2234);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Summary_stmtContext extends ParserRuleContext {
		public TerminalNode T_SUMMARY() { return getToken(gParser.T_SUMMARY, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TOP() { return getToken(gParser.T_TOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_LIMIT() { return getToken(gParser.T_LIMIT, 0); }
		public Summary_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summary_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSummary_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSummary_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSummary_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Summary_stmtContext summary_stmt() throws RecognitionException {
		Summary_stmtContext _localctx = new Summary_stmtContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_summary_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			match(T_SUMMARY);
			setState(2239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(2237);
				match(T_TOP);
				setState(2238);
				expr(0);
				}
			}

			setState(2241);
			match(T_FOR);
			setState(2251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2242);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(2243);
				table_name();
				setState(2245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2244);
					where_clause();
					}
					break;
				}
				setState(2249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2247);
					match(T_LIMIT);
					setState(2248);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_stmtContext extends ParserRuleContext {
		public TerminalNode T_TRUNCATE() { return getToken(gParser.T_TRUNCATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public Truncate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTruncate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTruncate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTruncate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truncate_stmtContext truncate_stmt() throws RecognitionException {
		Truncate_stmtContext _localctx = new Truncate_stmtContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_truncate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2253);
			match(T_TRUNCATE);
			setState(2255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2254);
				match(T_TABLE);
				}
				break;
			}
			setState(2257);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_stmtContext extends ParserRuleContext {
		public TerminalNode T_USE() { return getToken(gParser.T_USE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Use_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_stmtContext use_stmt() throws RecognitionException {
		Use_stmtContext _localctx = new Use_stmtContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_use_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			match(T_USE);
			setState(2260);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_into_stmtContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(gParser.T_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public Values_into_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_into_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterValues_into_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitValues_into_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitValues_into_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_into_stmtContext values_into_stmt() throws RecognitionException {
		Values_into_stmtContext _localctx = new Values_into_stmtContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_values_into_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			match(T_VALUES);
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2263);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2266);
			expr(0);
			setState(2271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2267);
				match(T_COMMA);
				setState(2268);
				expr(0);
				}
				}
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2274);
				match(T_CLOSE_P);
				}
			}

			setState(2277);
			match(T_INTO);
			setState(2279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2278);
				match(T_OPEN_P);
				}
			}

			setState(2281);
			ident();
			setState(2286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2282);
					match(T_COMMA);
					setState(2283);
					ident();
					}
					} 
				}
				setState(2288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			}
			setState(2290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2289);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() { return getTokens(gParser.T_WHILE); }
		public TerminalNode T_WHILE(int i) {
			return getToken(gParser.T_WHILE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_DO() { return getToken(gParser.T_DO, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(gParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(gParser.T_LOOP, i);
		}
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public TerminalNode T_BEGIN() { return getToken(gParser.T_BEGIN, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2292);
			match(T_WHILE);
			setState(2293);
			bool_expr(0);
			setState(2294);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2295);
			block();
			setState(2296);
			match(T_END);
			setState(2298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2297);
				_la = _input.LA(1);
				if ( !(_la==T_LOOP || _la==T_WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_LOOP() { return getTokens(gParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(gParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFor_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		For_cursor_stmtContext _localctx = new For_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			match(T_FOR);
			setState(2301);
			match(L_ID);
			setState(2302);
			match(T_IN);
			setState(2304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2303);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2306);
			select_stmt();
			setState(2308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2307);
				match(T_CLOSE_P);
				}
			}

			setState(2310);
			match(T_LOOP);
			setState(2311);
			block();
			setState(2312);
			match(T_END);
			setState(2313);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(gParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(gParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(gParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(gParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(gParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor_range_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			match(T_FOR);
			setState(2316);
			match(L_ID);
			setState(2317);
			match(T_IN);
			setState(2319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2318);
				match(T_REVERSE);
				}
				break;
			}
			setState(2321);
			expr(0);
			setState(2322);
			match(T_DOT2);
			setState(2323);
			expr(0);
			setState(2326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(2324);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2325);
				expr(0);
				}
			}

			setState(2328);
			match(T_LOOP);
			setState(2329);
			block();
			setState(2330);
			match(T_END);
			setState(2331);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(gParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(gParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(gParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(gParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(gParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_label);
		try {
			setState(2339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2333);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2334);
				match(T_LESS);
				setState(2335);
				match(T_LESS);
				setState(2336);
				match(L_ID);
				setState(2337);
				match(T_GREATER);
				setState(2338);
				match(T_GREATER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode T_USING() { return getToken(gParser.T_USING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUsing_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUsing_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUsing_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			match(T_USING);
			setState(2342);
			expr(0);
			setState(2347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2343);
					match(T_COMMA);
					setState(2344);
					expr(0);
					}
					} 
				}
				setState(2349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(2350);
				cte_select_stmt();
				}
			}

			setState(2353);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCte_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			match(T_WITH);
			setState(2356);
			cte_select_stmt_item();
			setState(2361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2357);
				match(T_COMMA);
				setState(2358);
				cte_select_stmt_item();
				}
				}
				setState(2363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCte_select_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2364);
			ident();
			setState(2366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2365);
				cte_select_cols();
				}
			}

			setState(2368);
			match(T_AS);
			setState(2369);
			match(T_OPEN_P);
			setState(2370);
			fullselect_stmt();
			setState(2371);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCte_select_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			match(T_OPEN_P);
			setState(2374);
			ident();
			setState(2379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2375);
				match(T_COMMA);
				setState(2376);
				ident();
				}
				}
				setState(2381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2382);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFullselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			fullselect_stmt_item();
			setState(2390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2385);
					fullselect_set_clause();
					setState(2386);
					fullselect_stmt_item();
					}
					} 
				}
				setState(2392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFullselect_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_fullselect_stmt_item);
		try {
			setState(2398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2393);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(2394);
				match(T_OPEN_P);
				setState(2395);
				fullselect_stmt();
				setState(2396);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(gParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(gParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(gParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(gParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFullselect_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(2412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2400);
				match(T_UNION);
				setState(2402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2401);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2404);
				match(T_EXCEPT);
				setState(2406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2405);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2408);
				match(T_INTERSECT);
				setState(2410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2409);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(gParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(gParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSubselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2415);
			select_list();
			setState(2417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2416);
				into_clause();
				}
				break;
			}
			setState(2420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2419);
				from_clause();
				}
				break;
			}
			setState(2423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(2422);
				where_clause();
				}
				break;
			}
			setState(2426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2425);
				group_by_clause();
				}
				break;
			}
			setState(2430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2428);
				having_clause();
				}
				break;
			case 2:
				{
				setState(2429);
				qualify_clause();
				}
				break;
			}
			setState(2433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2432);
				order_by_clause();
				}
				break;
			}
			setState(2436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2435);
				select_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2438);
				select_list_set();
				}
				break;
			}
			setState(2442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2441);
				select_list_limit();
				}
				break;
			}
			setState(2444);
			select_list_item();
			setState(2449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2445);
					match(T_COMMA);
					setState(2446);
					select_list_item();
					}
					} 
				}
				setState(2451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(gParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(gParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(gParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_limit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			match(T_TOP);
			setState(2455);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2457);
					ident();
					setState(2458);
					match(T_EQUAL);
					}
					break;
				}
				setState(2462);
				expr(0);
				setState(2464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2463);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2466);
				select_list_asterisk();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(gParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(gParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_select_list_alias);
		try {
			setState(2478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2469);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(2471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2470);
					match(T_AS);
					}
					break;
				}
				setState(2473);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2474);
				match(T_OPEN_P);
				setState(2475);
				match(T_TITLE);
				setState(2476);
				match(L_S_STRING);
				setState(2477);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_asterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(2480);
				match(L_ID);
				setState(2481);
				match(T__3);
				}
			}

			setState(2484);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInto_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2486);
			match(T_INTO);
			setState(2487);
			ident();
			setState(2492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2488);
					match(T_COMMA);
					setState(2489);
					ident();
					}
					} 
				}
				setState(2494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(gParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
			match(T_FROM);
			setState(2496);
			from_table_clause();
			setState(2500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2497);
					from_join_clause();
					}
					} 
				}
				setState(2502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_table_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_from_table_clause);
		try {
			setState(2506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2503);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2504);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2505);
				from_table_values_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_table_name_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			table_name();
			setState(2510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2509);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_subselect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			match(T_OPEN_P);
			setState(2513);
			select_stmt();
			setState(2514);
			match(T_CLOSE_P);
			setState(2516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2515);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_from_join_clause);
		try {
			setState(2525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2518);
				match(T_COMMA);
				setState(2519);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2520);
				from_join_type_clause();
				setState(2521);
				from_table_clause();
				setState(2522);
				match(T_ON);
				setState(2523);
				bool_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(gParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(gParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(gParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(gParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(gParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(gParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_join_type_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2527);
					match(T_INNER);
					}
				}

				setState(2530);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2531);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2532);
					match(T_OUTER);
					}
				}

				setState(2535);
				match(T_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(gParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_table_values_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
			match(T_TABLE);
			setState(2539);
			match(T_OPEN_P);
			setState(2540);
			match(T_VALUES);
			setState(2541);
			from_table_values_row();
			setState(2546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2542);
				match(T_COMMA);
				setState(2543);
				from_table_values_row();
				}
				}
				setState(2548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2549);
			match(T_CLOSE_P);
			setState(2551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2550);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_table_values_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_from_table_values_row);
		int _la;
		try {
			setState(2565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2553);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2554);
				match(T_OPEN_P);
				setState(2555);
				expr(0);
				setState(2560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2556);
					match(T_COMMA);
					setState(2557);
					expr(0);
					}
					}
					setState(2562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2563);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(gParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(gParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_alias_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2567);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2568);
				match(T_AS);
				}
				break;
			}
			setState(2571);
			ident();
			setState(2582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2572);
				match(T_OPEN_P);
				setState(2573);
				match(L_ID);
				setState(2578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2574);
					match(T_COMMA);
					setState(2575);
					match(L_ID);
					}
					}
					setState(2580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2581);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(gParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2586);
			match(T_WHERE);
			setState(2587);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(gParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
			match(T_GROUP);
			setState(2590);
			match(T_BY);
			setState(2591);
			expr(0);
			setState(2596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2592);
					match(T_COMMA);
					setState(2593);
					expr(0);
					}
					} 
				}
				setState(2598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(gParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			match(T_HAVING);
			setState(2600);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(gParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitQualify_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2602);
			match(T_QUALIFY);
			setState(2603);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(gParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(gParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(gParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(gParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(gParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2605);
			match(T_ORDER);
			setState(2606);
			match(T_BY);
			setState(2607);
			expr(0);
			setState(2609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2608);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2611);
					match(T_COMMA);
					setState(2612);
					expr(0);
					setState(2614);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						setState(2613);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(2620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2622); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2621);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2624); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(gParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(gParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(gParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(gParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(gParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(gParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(gParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(gParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(gParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(gParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(gParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_select_options_item);
		int _la;
		try {
			setState(2637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2626);
				match(T_LIMIT);
				setState(2627);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2628);
				match(T_WITH);
				setState(2629);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (T_RR - 248)) | (1L << (T_RS - 248)) | (1L << (T_UR - 248)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2630);
					match(T_USE);
					setState(2631);
					match(T_AND);
					setState(2632);
					match(T_KEEP);
					setState(2633);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2634);
					match(T_LOCKS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public Update_tableContext update_table() {
			return getRuleContext(Update_tableContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public Update_assignmentContext update_assignment() {
			return getRuleContext(Update_assignmentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_upsertContext update_upsert() {
			return getRuleContext(Update_upsertContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_update_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2639);
			match(T_UPDATE);
			setState(2640);
			update_table();
			setState(2641);
			match(T_SET);
			setState(2642);
			update_assignment();
			setState(2644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(2643);
				where_clause();
				}
				break;
			}
			setState(2647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2646);
				update_upsert();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_assignmentContext extends ParserRuleContext {
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Update_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUpdate_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUpdate_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUpdate_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_assignmentContext update_assignment() throws RecognitionException {
		Update_assignmentContext _localctx = new Update_assignmentContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_update_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2649);
			assignment_stmt_item();
			setState(2654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2650);
					match(T_COMMA);
					setState(2651);
					assignment_stmt_item();
					}
					} 
				}
				setState(2656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public Update_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUpdate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUpdate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUpdate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_tableContext update_table() throws RecognitionException {
		Update_tableContext _localctx = new Update_tableContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_update_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(2657);
				table_name();
				setState(2659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2658);
					from_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(2661);
				match(T_OPEN_P);
				setState(2662);
				select_stmt();
				setState(2663);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				{
				setState(2668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2667);
					match(T_AS);
					}
					break;
				}
				setState(2670);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_upsertContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_upsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_upsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUpdate_upsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUpdate_upsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUpdate_upsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_upsertContext update_upsert() throws RecognitionException {
		Update_upsertContext _localctx = new Update_upsertContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_update_upsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2673);
			match(T_ELSE);
			setState(2674);
			insert_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_stmtContext extends ParserRuleContext {
		public TerminalNode T_MERGE() { return getToken(gParser.T_MERGE, 0); }
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public List<Merge_tableContext> merge_table() {
			return getRuleContexts(Merge_tableContext.class);
		}
		public Merge_tableContext merge_table(int i) {
			return getRuleContext(Merge_tableContext.class,i);
		}
		public TerminalNode T_USING() { return getToken(gParser.T_USING, 0); }
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Merge_conditionContext> merge_condition() {
			return getRuleContexts(Merge_conditionContext.class);
		}
		public Merge_conditionContext merge_condition(int i) {
			return getRuleContext(Merge_conditionContext.class,i);
		}
		public Merge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMerge_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMerge_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMerge_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_stmtContext merge_stmt() throws RecognitionException {
		Merge_stmtContext _localctx = new Merge_stmtContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_merge_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2676);
			match(T_MERGE);
			setState(2677);
			match(T_INTO);
			setState(2678);
			merge_table();
			setState(2679);
			match(T_USING);
			setState(2680);
			merge_table();
			setState(2681);
			match(T_ON);
			setState(2682);
			bool_expr(0);
			setState(2684); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2683);
					merge_condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2686); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public Merge_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMerge_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMerge_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMerge_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_tableContext merge_table() throws RecognitionException {
		Merge_tableContext _localctx = new Merge_tableContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_merge_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(2688);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(2689);
				match(T_OPEN_P);
				setState(2690);
				select_stmt();
				setState(2691);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2695);
					match(T_AS);
					}
					break;
				}
				setState(2698);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_conditionContext extends ParserRuleContext {
		public TerminalNode T_WHEN() { return getToken(gParser.T_WHEN, 0); }
		public TerminalNode T_MATCHED() { return getToken(gParser.T_MATCHED, 0); }
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public Merge_actionContext merge_action() {
			return getRuleContext(Merge_actionContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_AND() { return getToken(gParser.T_AND, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public TerminalNode T_IGNORE() { return getToken(gParser.T_IGNORE, 0); }
		public Merge_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMerge_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMerge_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMerge_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_conditionContext merge_condition() throws RecognitionException {
		Merge_conditionContext _localctx = new Merge_conditionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_merge_condition);
		int _la;
		try {
			setState(2714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2701);
				match(T_WHEN);
				setState(2703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2702);
					match(T_NOT);
					}
				}

				setState(2705);
				match(T_MATCHED);
				setState(2708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AND) {
					{
					setState(2706);
					match(T_AND);
					setState(2707);
					bool_expr(0);
					}
				}

				setState(2710);
				match(T_THEN);
				setState(2711);
				merge_action();
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2712);
				match(T_ELSE);
				setState(2713);
				match(T_IGNORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_actionContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(gParser.T_INSERT, 0); }
		public TerminalNode T_VALUES() { return getToken(gParser.T_VALUES, 0); }
		public Insert_stmt_rowContext insert_stmt_row() {
			return getRuleContext(Insert_stmt_rowContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_DELETE() { return getToken(gParser.T_DELETE, 0); }
		public Merge_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMerge_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMerge_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMerge_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_actionContext merge_action() throws RecognitionException {
		Merge_actionContext _localctx = new Merge_actionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_merge_action);
		int _la;
		try {
			int _alt;
			setState(2736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2716);
				match(T_INSERT);
				setState(2718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2717);
					insert_stmt_cols();
					}
				}

				setState(2720);
				match(T_VALUES);
				setState(2721);
				insert_stmt_row();
				}
				break;
			case T_UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2722);
				match(T_UPDATE);
				setState(2723);
				match(T_SET);
				setState(2724);
				assignment_stmt_item();
				setState(2729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2725);
						match(T_COMMA);
						setState(2726);
						assignment_stmt_item();
						}
						} 
					}
					setState(2731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
				}
				setState(2733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(2732);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2735);
				match(T_DELETE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(gParser.T_DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_FROM() { return getToken(gParser.T_FROM, 0); }
		public Delete_aliasContext delete_alias() {
			return getRuleContext(Delete_aliasContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_ALL() { return getToken(gParser.T_ALL, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2738);
			match(T_DELETE);
			setState(2740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				setState(2739);
				match(T_FROM);
				}
				break;
			}
			setState(2742);
			table_name();
			setState(2744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				{
				setState(2743);
				delete_alias();
				}
				break;
			}
			setState(2748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2746);
				where_clause();
				}
				break;
			case 2:
				{
				setState(2747);
				match(T_ALL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public Delete_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDelete_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDelete_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDelete_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_aliasContext delete_alias() throws RecognitionException {
		Delete_aliasContext _localctx = new Delete_aliasContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_delete_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2750);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("ALL"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"ALL\")");
			setState(2752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2751);
				match(T_AS);
				}
				break;
			}
			setState(2754);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Describe_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_DESCRIBE() { return getToken(gParser.T_DESCRIBE, 0); }
		public TerminalNode T_DESC() { return getToken(gParser.T_DESC, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public Describe_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDescribe_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDescribe_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDescribe_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Describe_stmtContext describe_stmt() throws RecognitionException {
		Describe_stmtContext _localctx = new Describe_stmtContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_describe_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2756);
			_la = _input.LA(1);
			if ( !(_la==T_DESC || _la==T_DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2757);
				match(T_TABLE);
				}
				break;
			}
			setState(2760);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 396;
		enterRecursionRule(_localctx, 396, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
			case 1:
				{
				setState(2764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2763);
					match(T_NOT);
					}
				}

				setState(2766);
				match(T_OPEN_P);
				setState(2767);
				bool_expr(0);
				setState(2768);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2770);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2773);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2774);
					bool_expr_logical_operator();
					setState(2775);
					bool_expr(3);
					}
					} 
				}
				setState(2781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_bool_expr_atom);
		try {
			setState(2785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2782);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2783);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2784);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(gParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(gParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(gParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2787);
				expr(0);
				setState(2788);
				match(T_IS);
				setState(2790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2789);
					match(T_NOT);
					}
				}

				setState(2792);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2794);
				expr(0);
				setState(2795);
				match(T_BETWEEN);
				setState(2796);
				expr(0);
				setState(2797);
				match(T_AND);
				setState(2798);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2800);
					match(T_NOT);
					}
				}

				setState(2803);
				match(T_EXISTS);
				setState(2804);
				match(T_OPEN_P);
				setState(2805);
				select_stmt();
				setState(2806);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2808);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2809);
				bool_expr_multi_in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_single_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2812);
			expr(0);
			setState(2814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2813);
				match(T_NOT);
				}
			}

			setState(2816);
			match(T_IN);
			setState(2817);
			match(T_OPEN_P);
			setState(2827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				{
				{
				setState(2818);
				expr(0);
				setState(2823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2819);
					match(T_COMMA);
					setState(2820);
					expr(0);
					}
					}
					setState(2825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2826);
				select_stmt();
				}
				break;
			}
			setState(2829);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_multi_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2831);
			match(T_OPEN_P);
			setState(2832);
			expr(0);
			setState(2837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2833);
				match(T_COMMA);
				setState(2834);
				expr(0);
				}
				}
				setState(2839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2840);
			match(T_CLOSE_P);
			setState(2842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2841);
				match(T_NOT);
				}
			}

			setState(2844);
			match(T_IN);
			setState(2845);
			match(T_OPEN_P);
			setState(2846);
			select_stmt();
			setState(2847);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2849);
			expr(0);
			setState(2850);
			bool_expr_binary_operator();
			setState(2851);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(gParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_logical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2853);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(gParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(gParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(gParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(gParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(gParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(gParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(gParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(gParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(gParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(gParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2855);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2856);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2857);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2858);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2859);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2860);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2861);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2862);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2863);
					match(T_NOT);
					}
				}

				setState(2866);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(gParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(gParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(gParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(gParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 412;
		enterRecursionRule(_localctx, 412, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				{
				setState(2870);
				match(T_OPEN_P);
				setState(2871);
				select_stmt();
				setState(2872);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2874);
				match(T_OPEN_P);
				setState(2875);
				expr(0);
				setState(2876);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2878);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2879);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2880);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2881);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2882);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2883);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2884);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2885);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2902);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2888);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2889);
						match(T_MUL);
						setState(2890);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2891);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2892);
						match(T_DIV);
						setState(2893);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2894);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2895);
						match(T_ADD);
						setState(2896);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2897);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2898);
						match(T_SUB);
						setState(2899);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2900);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2901);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expr_atom);
		try {
			setState(2915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2907);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2908);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2909);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2910);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2911);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2912);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2913);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2914);
				null_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(gParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2917);
			match(T_INTERVAL);
			setState(2918);
			expr(0);
			setState(2919);
			interval_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(gParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(gParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(gParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(gParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(gParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(gParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInterval_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2921);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(gParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(gParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(gParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(gParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2923);
			expr_concat_item();
			setState(2924);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2925);
			expr_concat_item();
			setState(2930);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2926);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2927);
					expr_concat_item();
					}
					} 
				}
				setState(2932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_concat_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_expr_concat_item);
		try {
			setState(2942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2933);
				match(T_OPEN_P);
				setState(2934);
				expr(0);
				setState(2935);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2937);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2938);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2939);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2940);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2941);
				expr_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_expr_case);
		try {
			setState(2946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2944);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2945);
				expr_case_searched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(gParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(gParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(gParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(gParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(gParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_case_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2948);
			match(T_CASE);
			setState(2949);
			expr(0);
			setState(2955); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2950);
				match(T_WHEN);
				setState(2951);
				expr(0);
				setState(2952);
				match(T_THEN);
				setState(2953);
				expr(0);
				}
				}
				setState(2957); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2959);
				match(T_ELSE);
				setState(2960);
				expr(0);
				}
			}

			setState(2963);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(gParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(gParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(gParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(gParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(gParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_case_searched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2965);
			match(T_CASE);
			setState(2971); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2966);
				match(T_WHEN);
				setState(2967);
				bool_expr(0);
				setState(2968);
				match(T_THEN);
				setState(2969);
				expr(0);
				}
				}
				setState(2973); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2975);
				match(T_ELSE);
				setState(2976);
				expr(0);
				}
			}

			setState(2979);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(gParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(gParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(gParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_cursor_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2981);
			ident();
			setState(2982);
			match(T__2);
			setState(2983);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(gParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(gParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(gParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(gParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(gParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(gParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(gParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(gParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(gParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(gParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(gParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(gParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(gParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(gParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(gParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(gParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(gParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_agg_window_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(3137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2985);
				match(T_AVG);
				setState(2986);
				match(T_OPEN_P);
				setState(2988);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2987);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2990);
				expr(0);
				setState(2991);
				match(T_CLOSE_P);
				setState(2993);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
				case 1:
					{
					setState(2992);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2995);
				match(T_COUNT);
				setState(2996);
				match(T_OPEN_P);
				setState(3002);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2998);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
					case 1:
						{
						setState(2997);
						expr_func_all_distinct();
						}
						break;
					}
					setState(3000);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(3001);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3004);
				match(T_CLOSE_P);
				setState(3006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
				case 1:
					{
					setState(3005);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(3008);
				match(T_COUNT_BIG);
				setState(3009);
				match(T_OPEN_P);
				setState(3015);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(3011);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
					case 1:
						{
						setState(3010);
						expr_func_all_distinct();
						}
						break;
					}
					setState(3013);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(3014);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3017);
				match(T_CLOSE_P);
				setState(3019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(3018);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(3021);
				match(T_CUME_DIST);
				setState(3022);
				match(T_OPEN_P);
				setState(3023);
				match(T_CLOSE_P);
				setState(3024);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(3025);
				match(T_DENSE_RANK);
				setState(3026);
				match(T_OPEN_P);
				setState(3027);
				match(T_CLOSE_P);
				setState(3028);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(3029);
				match(T_FIRST_VALUE);
				setState(3030);
				match(T_OPEN_P);
				setState(3031);
				expr(0);
				setState(3032);
				match(T_CLOSE_P);
				setState(3033);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(3035);
				match(T_LAG);
				setState(3036);
				match(T_OPEN_P);
				setState(3037);
				expr(0);
				setState(3044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3038);
					match(T_COMMA);
					setState(3039);
					expr(0);
					setState(3042);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(3040);
						match(T_COMMA);
						setState(3041);
						expr(0);
						}
					}

					}
				}

				setState(3046);
				match(T_CLOSE_P);
				setState(3047);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(3049);
				match(T_LAST_VALUE);
				setState(3050);
				match(T_OPEN_P);
				setState(3051);
				expr(0);
				setState(3052);
				match(T_CLOSE_P);
				setState(3053);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(3055);
				match(T_LEAD);
				setState(3056);
				match(T_OPEN_P);
				setState(3057);
				expr(0);
				setState(3064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3058);
					match(T_COMMA);
					setState(3059);
					expr(0);
					setState(3062);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(3060);
						match(T_COMMA);
						setState(3061);
						expr(0);
						}
					}

					}
				}

				setState(3066);
				match(T_CLOSE_P);
				setState(3067);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(3069);
				match(T_MAX);
				setState(3070);
				match(T_OPEN_P);
				setState(3072);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
				case 1:
					{
					setState(3071);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3074);
				expr(0);
				setState(3075);
				match(T_CLOSE_P);
				setState(3077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
				case 1:
					{
					setState(3076);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3079);
				match(T_MIN);
				setState(3080);
				match(T_OPEN_P);
				setState(3082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
				case 1:
					{
					setState(3081);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3084);
				expr(0);
				setState(3085);
				match(T_CLOSE_P);
				setState(3087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
				case 1:
					{
					setState(3086);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(3089);
				match(T_RANK);
				setState(3090);
				match(T_OPEN_P);
				setState(3091);
				match(T_CLOSE_P);
				setState(3092);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(3093);
				match(T_ROW_NUMBER);
				setState(3094);
				match(T_OPEN_P);
				setState(3095);
				match(T_CLOSE_P);
				setState(3096);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(3097);
				match(T_STDEV);
				setState(3098);
				match(T_OPEN_P);
				setState(3100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
				case 1:
					{
					setState(3099);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3102);
				expr(0);
				setState(3103);
				match(T_CLOSE_P);
				setState(3105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
				case 1:
					{
					setState(3104);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(3107);
				match(T_SUM);
				setState(3108);
				match(T_OPEN_P);
				setState(3110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
				case 1:
					{
					setState(3109);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3112);
				expr(0);
				setState(3113);
				match(T_CLOSE_P);
				setState(3115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
				case 1:
					{
					setState(3114);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(3117);
				match(T_VAR);
				setState(3118);
				match(T_OPEN_P);
				setState(3120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
				case 1:
					{
					setState(3119);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3122);
				expr(0);
				setState(3123);
				match(T_CLOSE_P);
				setState(3125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
				case 1:
					{
					setState(3124);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(3127);
				match(T_VARIANCE);
				setState(3128);
				match(T_OPEN_P);
				setState(3130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
				case 1:
					{
					setState(3129);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3132);
				expr(0);
				setState(3133);
				match(T_CLOSE_P);
				setState(3135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
				case 1:
					{
					setState(3134);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(gParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(gParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func_all_distinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3139);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(gParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func_over_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3141);
			match(T_OVER);
			setState(3142);
			match(T_OPEN_P);
			setState(3144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(3143);
				expr_func_partition_by_clause();
				}
			}

			setState(3147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(3146);
				order_by_clause();
				}
			}

			setState(3149);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(gParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func_partition_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3151);
			match(T_PARTITION);
			setState(3152);
			match(T_BY);
			setState(3153);
			expr(0);
			setState(3158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(3154);
				match(T_COMMA);
				setState(3155);
				expr(0);
				}
				}
				setState(3160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(gParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(gParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(gParser.T_COUNT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(gParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(gParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(gParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(gParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(gParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(gParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(gParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(gParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(gParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(gParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(gParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(gParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(gParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(gParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(gParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(gParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(gParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(gParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(gParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(gParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(gParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_spec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(3361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3161);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3162);
				match(T_CAST);
				setState(3163);
				match(T_OPEN_P);
				setState(3164);
				expr(0);
				setState(3165);
				match(T_AS);
				setState(3166);
				dtype();
				setState(3168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(3167);
					dtype_len();
					}
				}

				setState(3170);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3172);
				match(T_COUNT);
				setState(3173);
				match(T_OPEN_P);
				setState(3176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(3174);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(3175);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3178);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3179);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3180);
				match(T_CURRENT);
				setState(3181);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(3182);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(3183);
					match(T_CURRENT);
					setState(3184);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
				case 1:
					{
					setState(3187);
					match(T_OPEN_P);
					setState(3188);
					expr(0);
					setState(3189);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3193);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3194);
				match(T_CURRENT);
				setState(3195);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3196);
				match(T_MAX_PART_STRING);
				setState(3197);
				match(T_OPEN_P);
				setState(3198);
				expr(0);
				setState(3211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3199);
					match(T_COMMA);
					setState(3200);
					expr(0);
					setState(3208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3201);
						match(T_COMMA);
						setState(3202);
						expr(0);
						setState(3203);
						match(T_EQUAL);
						setState(3204);
						expr(0);
						}
						}
						setState(3210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3213);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3215);
				match(T_MIN_PART_STRING);
				setState(3216);
				match(T_OPEN_P);
				setState(3217);
				expr(0);
				setState(3230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3218);
					match(T_COMMA);
					setState(3219);
					expr(0);
					setState(3227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3220);
						match(T_COMMA);
						setState(3221);
						expr(0);
						setState(3222);
						match(T_EQUAL);
						setState(3223);
						expr(0);
						}
						}
						setState(3229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3232);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3234);
				match(T_MAX_PART_INT);
				setState(3235);
				match(T_OPEN_P);
				setState(3236);
				expr(0);
				setState(3249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3237);
					match(T_COMMA);
					setState(3238);
					expr(0);
					setState(3246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3239);
						match(T_COMMA);
						setState(3240);
						expr(0);
						setState(3241);
						match(T_EQUAL);
						setState(3242);
						expr(0);
						}
						}
						setState(3248);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3251);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3253);
				match(T_MIN_PART_INT);
				setState(3254);
				match(T_OPEN_P);
				setState(3255);
				expr(0);
				setState(3268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3256);
					match(T_COMMA);
					setState(3257);
					expr(0);
					setState(3265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3258);
						match(T_COMMA);
						setState(3259);
						expr(0);
						setState(3260);
						match(T_EQUAL);
						setState(3261);
						expr(0);
						}
						}
						setState(3267);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3270);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3272);
				match(T_MAX_PART_DATE);
				setState(3273);
				match(T_OPEN_P);
				setState(3274);
				expr(0);
				setState(3287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3275);
					match(T_COMMA);
					setState(3276);
					expr(0);
					setState(3284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3277);
						match(T_COMMA);
						setState(3278);
						expr(0);
						setState(3279);
						match(T_EQUAL);
						setState(3280);
						expr(0);
						}
						}
						setState(3286);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3289);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3291);
				match(T_MIN_PART_DATE);
				setState(3292);
				match(T_OPEN_P);
				setState(3293);
				expr(0);
				setState(3306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3294);
					match(T_COMMA);
					setState(3295);
					expr(0);
					setState(3303);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3296);
						match(T_COMMA);
						setState(3297);
						expr(0);
						setState(3298);
						match(T_EQUAL);
						setState(3299);
						expr(0);
						}
						}
						setState(3305);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3308);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3310);
				match(T_PART_COUNT);
				setState(3311);
				match(T_OPEN_P);
				setState(3312);
				expr(0);
				setState(3320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(3313);
					match(T_COMMA);
					setState(3314);
					expr(0);
					setState(3315);
					match(T_EQUAL);
					setState(3316);
					expr(0);
					}
					}
					setState(3322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3323);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3325);
				match(T_PART_LOC);
				setState(3326);
				match(T_OPEN_P);
				setState(3327);
				expr(0);
				setState(3333); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3328);
						match(T_COMMA);
						setState(3329);
						expr(0);
						setState(3330);
						match(T_EQUAL);
						setState(3331);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3335); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,410,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3337);
					match(T_COMMA);
					setState(3338);
					expr(0);
					}
				}

				setState(3341);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3343);
				match(T_TRIM);
				setState(3344);
				match(T_OPEN_P);
				setState(3345);
				expr(0);
				setState(3346);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3348);
				match(T_SUBSTRING);
				setState(3349);
				match(T_OPEN_P);
				setState(3350);
				expr(0);
				setState(3351);
				match(T_FROM);
				setState(3352);
				expr(0);
				setState(3355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(3353);
					match(T_FOR);
					setState(3354);
					expr(0);
					}
				}

				setState(3357);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3359);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3360);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3363);
			ident();
			setState(3364);
			match(T_OPEN_P);
			setState(3366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
			case 1:
				{
				setState(3365);
				expr_func_params();
				}
				break;
			}
			setState(3368);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3370);
			func_param();
			setState(3375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3371);
					match(T_COMMA);
					setState(3372);
					func_param();
					}
					} 
				}
				setState(3377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(gParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunc_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3378);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(3384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
			case 1:
				{
				setState(3379);
				ident();
				setState(3380);
				match(T_EQUAL);
				setState(3382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(3381);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(3386);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_selectContext expr_select() throws RecognitionException {
		Expr_selectContext _localctx = new Expr_selectContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_expr_select);
		try {
			setState(3390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3388);
				select_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3389);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_fileContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_fileContext expr_file() throws RecognitionException {
		Expr_fileContext _localctx = new Expr_fileContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_expr_file);
		try {
			setState(3394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,419,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3392);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3393);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HiveContext extends ParserRuleContext {
		public TerminalNode T_HIVE() { return getToken(gParser.T_HIVE, 0); }
		public List<Hive_itemContext> hive_item() {
			return getRuleContexts(Hive_itemContext.class);
		}
		public Hive_itemContext hive_item(int i) {
			return getRuleContext(Hive_itemContext.class,i);
		}
		public HiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HiveContext hive() throws RecognitionException {
		HiveContext _localctx = new HiveContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_hive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3396);
			match(T_HIVE);
			setState(3400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3397);
					hive_item();
					}
					} 
				}
				setState(3402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hive_itemContext extends ParserRuleContext {
		public TerminalNode T_SUB() { return getToken(gParser.T_SUB, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public Hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hive_itemContext hive_item() throws RecognitionException {
		Hive_itemContext _localctx = new Hive_itemContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_hive_item);
		try {
			setState(3415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3403);
				match(T_SUB);
				setState(3404);
				ident();
				setState(3405);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3407);
				match(T_SUB);
				setState(3408);
				ident();
				setState(3409);
				match(L_ID);
				setState(3410);
				match(T_EQUAL);
				setState(3411);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3413);
				match(T_SUB);
				setState(3414);
				ident();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostContext extends ParserRuleContext {
		public Host_cmdContext host_cmd() {
			return getRuleContext(Host_cmdContext.class,0);
		}
		public Host_stmtContext host_stmt() {
			return getRuleContext(Host_stmtContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_host);
		try {
			setState(3422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(3417);
				match(T__4);
				setState(3418);
				host_cmd();
				setState(3419);
				match(T_SEMICOLON);
				}
				break;
			case T_HOST:
				enterOuterAlt(_localctx, 2);
				{
				setState(3421);
				host_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Host_cmdContext extends ParserRuleContext {
		public Host_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHost_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHost_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHost_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Host_cmdContext host_cmd() throws RecognitionException {
		Host_cmdContext _localctx = new Host_cmdContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_host_cmd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(3424);
					matchWildcard();
					}
					} 
				}
				setState(3429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Host_stmtContext extends ParserRuleContext {
		public TerminalNode T_HOST() { return getToken(gParser.T_HOST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Host_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHost_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHost_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHost_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Host_stmtContext host_stmt() throws RecognitionException {
		Host_stmtContext _localctx = new Host_stmtContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_host_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3430);
			match(T_HOST);
			setState(3431);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode L_FILE() { return getToken(gParser.L_FILE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_file_name);
		try {
			int _alt;
			setState(3447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3433);
				match(L_FILE);
				}
				break;
			case T__3:
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_DIV:
			case L_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_DIV:
					{
					setState(3434);
					match(T_DIV);
					}
					break;
				case T__3:
					{
					setState(3435);
					match(T__3);
					setState(3436);
					match(T_DIV);
					}
					break;
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case L_ID:
					break;
				default:
					break;
				}
				setState(3439);
				ident();
				setState(3444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3440);
						match(T_DIV);
						setState(3441);
						ident();
						}
						} 
					}
					setState(3446);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(gParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3449);
			match(T_DATE);
			setState(3450);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(gParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTimestamp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3452);
			match(T_TIMESTAMP);
			setState(3453);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(gParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(gParser.L_ID, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(3455);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(3456);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,429,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3459);
					match(T__3);
					setState(3462);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(3460);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
						{
						setState(3461);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(3468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,429,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(gParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDouble_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(gParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSingle_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_string);
		try {
			setState(3471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3469);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3470);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(gParser.L_INT, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3473);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3476);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(gParser.L_DEC, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDec_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3478);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3481);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(gParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(gParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3483);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNull_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3485);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(gParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(gParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(gParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(gParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(gParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(gParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(gParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(gParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(gParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(gParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(gParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(gParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(gParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(gParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(gParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(gParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(gParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(gParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(gParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(gParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(gParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(gParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(gParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(gParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(gParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(gParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(gParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(gParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(gParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(gParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(gParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(gParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(gParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(gParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(gParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(gParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(gParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(gParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(gParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(gParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(gParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(gParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(gParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(gParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(gParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(gParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(gParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(gParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(gParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(gParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(gParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(gParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(gParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(gParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(gParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(gParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(gParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(gParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(gParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(gParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(gParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(gParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(gParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(gParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(gParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(gParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(gParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(gParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(gParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(gParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(gParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(gParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(gParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(gParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(gParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(gParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(gParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(gParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(gParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(gParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(gParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(gParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(gParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(gParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(gParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(gParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(gParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(gParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(gParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(gParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(gParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(gParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(gParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(gParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(gParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(gParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(gParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(gParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(gParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(gParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(gParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(gParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(gParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(gParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(gParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(gParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(gParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(gParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(gParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(gParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(gParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(gParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(gParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(gParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(gParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(gParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(gParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(gParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(gParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(gParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(gParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(gParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(gParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(gParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(gParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(gParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(gParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(gParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(gParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(gParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(gParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(gParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(gParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(gParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(gParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(gParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(gParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(gParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(gParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(gParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(gParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(gParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(gParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(gParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(gParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(gParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(gParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(gParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(gParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(gParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(gParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(gParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(gParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(gParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(gParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(gParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(gParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(gParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(gParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(gParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(gParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(gParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(gParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(gParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(gParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(gParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(gParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(gParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(gParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(gParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(gParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(gParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(gParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(gParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(gParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(gParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(gParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(gParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(gParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(gParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(gParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(gParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(gParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(gParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(gParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(gParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(gParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(gParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(gParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(gParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(gParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(gParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(gParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(gParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(gParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(gParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(gParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(gParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(gParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(gParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(gParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(gParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(gParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(gParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(gParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(gParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(gParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(gParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(gParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(gParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(gParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(gParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(gParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(gParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(gParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(gParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(gParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(gParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(gParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(gParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(gParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(gParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(gParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(gParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(gParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(gParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(gParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(gParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(gParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(gParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(gParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(gParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(gParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(gParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(gParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(gParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(gParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(gParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(gParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(gParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(gParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(gParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(gParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(gParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(gParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(gParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(gParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(gParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(gParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(gParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(gParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(gParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(gParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(gParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(gParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(gParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(gParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(gParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(gParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(gParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(gParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(gParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(gParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(gParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(gParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(gParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(gParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(gParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(gParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(gParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(gParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(gParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(gParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(gParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(gParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(gParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(gParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(gParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(gParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(gParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(gParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(gParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(gParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(gParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(gParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(gParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(gParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(gParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(gParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(gParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(gParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(gParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(gParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(gParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(gParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(gParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(gParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(gParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(gParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNon_reserved_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3487);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CREATOR - 64)) | (1L << (T_CS - 64)) | (1L << (T_CURRENT - 64)) | (1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_GRANT - 128)) | (1L << (T_GROUP - 128)) | (1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOUNT - 192)) | (1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 11:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 88:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 167:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 178:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 196:
			return delete_alias_sempred((Delete_aliasContext)_localctx, predIndex);
		case 198:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 206:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 223:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean delete_alias_sempred(Delete_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !_input.LT(1).getText().equalsIgnoreCase("ALL");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017d\u0da4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\3\2\3\2\3\2\3\3\3\3\5\3\u01ea\n\3\3\3\5\3\u01ed"+
		"\n\3\6\3\u01ef\n\3\r\3\16\3\u01f0\3\4\5\4\u01f4\n\4\3\4\3\4\3\4\5\4\u01f9"+
		"\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u0200\n\5\3\5\3\5\3\5\3\5\5\5\u0206\n\5\5"+
		"\5\u0208\n\5\3\6\3\6\3\6\3\7\3\7\6\7\u020f\n\7\r\7\16\7\u0210\3\7\5\7"+
		"\u0214\n\7\5\7\u0216\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0258\n\b\3\t\3\t\3\n\3\n\6\n\u025e\n\n\r\n\16\n\u025f\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0270\n\16"+
		"\3\16\3\16\3\16\7\16\u0275\n\16\f\16\16\16\u0278\13\16\5\16\u027a\n\16"+
		"\3\17\3\17\3\17\5\17\u027f\n\17\3\20\3\20\5\20\u0283\n\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u028c\n\20\3\20\3\20\3\20\5\20\u0291\n\20"+
		"\3\21\3\21\3\21\3\21\7\21\u0297\n\21\f\21\16\21\u029a\13\21\3\21\3\21"+
		"\5\21\u029e\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u02a5\n\21\f\21\16\21\u02a8"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u02b1\n\22\f\22\16\22\u02b4"+
		"\13\22\3\22\3\22\5\22\u02b8\n\22\3\22\5\22\u02bb\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02c9\n\23\3\23\3\23"+
		"\3\24\3\24\3\24\5\24\u02d0\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u02d7\n"+
		"\24\f\24\16\24\u02da\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\5\27\u02ea\n\27\3\27\3\27\5\27\u02ee\n\27\3"+
		"\30\3\30\3\30\3\30\7\30\u02f4\n\30\f\30\16\30\u02f7\13\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\7\31\u02ff\n\31\f\31\16\31\u0302\13\31\3\32\3\32\3"+
		"\32\3\32\3\32\7\32\u0309\n\32\f\32\16\32\u030c\13\32\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u0313\n\33\3\34\3\34\3\34\7\34\u0318\n\34\f\34\16\34\u031b"+
		"\13\34\3\34\5\34\u031e\n\34\3\34\3\34\5\34\u0322\n\34\3\34\7\34\u0325"+
		"\n\34\f\34\16\34\u0328\13\34\3\34\5\34\u032b\n\34\3\34\3\34\3\34\5\34"+
		"\u0330\n\34\3\34\3\34\5\34\u0334\n\34\3\34\3\34\5\34\u0338\n\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0342\n\36\3\36\3\36\5\36\u0346"+
		"\n\36\3\36\3\36\3\36\5\36\u034b\n\36\3\37\3\37\3\37\5\37\u0350\n\37\3"+
		"\37\3\37\5\37\u0354\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0361\n!"+
		"\3!\3!\3\"\5\"\u0366\n\"\3\"\3\"\3\"\3\"\5\"\u036c\n\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\5#\u0375\n#\3#\3#\5#\u0379\n#\3#\3#\3$\3$\3$\3$\5$\u0381\n$\3"+
		"$\5$\u0384\n$\3$\3$\3$\5$\u0389\n$\3$\3$\3%\5%\u038e\n%\3%\3%\3%\3%\3"+
		"%\5%\u0395\n%\3%\3%\3%\3%\3%\5%\u039c\n%\3%\5%\u039f\n%\3%\5%\u03a2\n"+
		"%\3&\3&\3&\7&\u03a7\n&\f&\16&\u03aa\13&\3\'\3\'\3\'\5\'\u03af\n\'\3\'"+
		"\7\'\u03b2\n\'\f\'\16\'\u03b5\13\'\3\'\7\'\u03b8\n\'\f\'\16\'\u03bb\13"+
		"\'\3\'\3\'\5\'\u03bf\n\'\3\'\5\'\u03c2\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3+"+
		"\3+\7+\u03ce\n+\f+\16+\u03d1\13+\3+\3+\3+\3,\3,\3-\3-\3-\3-\7-\u03dc\n"+
		"-\f-\16-\u03df\13-\3-\5-\u03e2\n-\3-\3-\7-\u03e6\n-\f-\16-\u03e9\13-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u03f7\n.\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u0404\n\60\3\61\3\61\3\61\3\61\5\61\u040a"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0414\n\62\f\62\16"+
		"\62\u0417\13\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u042b\n\62\3\62\3\62\3\62\7\62"+
		"\u0430\n\62\f\62\16\62\u0433\13\62\3\62\3\62\3\62\5\62\u0438\n\62\3\63"+
		"\3\63\3\64\3\64\3\64\5\64\u043f\n\64\3\65\3\65\3\66\3\66\5\66\u0445\n"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0451\n\66"+
		"\f\66\16\66\u0454\13\66\3\66\3\66\3\66\3\66\3\66\7\66\u045b\n\66\f\66"+
		"\16\66\u045e\13\66\3\66\3\66\3\66\5\66\u0463\n\66\3\67\3\67\3\67\5\67"+
		"\u0468\n\67\3\67\3\67\3\67\5\67\u046d\n\67\3\67\3\67\3\67\5\67\u0472\n"+
		"\67\7\67\u0474\n\67\f\67\16\67\u0477\13\67\3\67\3\67\5\67\u047b\n\67\3"+
		"\67\5\67\u047e\n\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0486\n\67\f\67"+
		"\16\67\u0489\13\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0492\n\67"+
		"\f\67\16\67\u0495\13\67\3\67\3\67\7\67\u0499\n\67\f\67\16\67\u049c\13"+
		"\67\5\67\u049e\n\67\38\38\38\38\38\38\38\38\38\38\58\u04aa\n8\39\69\u04ad"+
		"\n9\r9\169\u04ae\3:\3:\3:\5:\u04b4\n:\3;\5;\u04b7\n;\3;\3;\3<\3<\3<\3"+
		"=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u04ca\n>\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\6?\u04d7\n?\r?\16?\u04d8\3?\3?\3?\5?\u04de\n?\3@\5@\u04e1\n"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u04ee\n@\f@\16@\u04f1\13@\3@\3@"+
		"\3@\5@\u04f6\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0501\n@\3A\5A\u0504\nA"+
		"\3A\3A\3A\3A\3A\3A\7A\u050c\nA\fA\16A\u050f\13A\3A\3A\3A\3A\5A\u0515\n"+
		"A\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\5D\u0534\nD\3E\3E\3E\3E\5E\u053a\nE\3F\3F\5F\u053e"+
		"\nF\3F\3F\3F\5F\u0543\nF\3F\3F\5F\u0547\nF\3F\3F\3F\5F\u054c\nF\3F\5F"+
		"\u054f\nF\3F\3F\3F\5F\u0554\nF\3F\5F\u0557\nF\3G\3G\3G\3G\3G\3H\3H\3I"+
		"\3I\3I\5I\u0563\nI\3I\3I\3J\3J\3J\5J\u056a\nJ\3J\3J\3J\5J\u056f\nJ\3J"+
		"\3J\3J\5J\u0574\nJ\7J\u0576\nJ\fJ\16J\u0579\13J\3J\3J\5J\u057d\nJ\3J\5"+
		"J\u0580\nJ\3J\3J\3J\3J\3J\3J\7J\u0588\nJ\fJ\16J\u058b\13J\3J\3J\3J\3J"+
		"\3J\3J\3J\7J\u0594\nJ\fJ\16J\u0597\13J\3J\3J\7J\u059b\nJ\fJ\16J\u059e"+
		"\13J\3J\3J\3J\3J\3J\5J\u05a5\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5"+
		"K\u05b3\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u05d2\nK\5K\u05d4\nK\3L\3L\3L\5L\u05d9"+
		"\nL\3L\3L\5L\u05dd\nL\3L\3L\3M\5M\u05e2\nM\3M\3M\3M\3M\3M\5M\u05e9\nM"+
		"\3M\5M\u05ec\nM\3N\5N\u05ef\nN\3N\3N\3N\5N\u05f4\nN\3N\3N\5N\u05f8\nN"+
		"\5N\u05fa\nN\3O\3O\3O\3O\3O\5O\u0601\nO\3O\3O\7O\u0605\nO\fO\16O\u0608"+
		"\13O\3P\3P\3P\3P\5P\u060e\nP\3Q\3Q\3Q\3Q\5Q\u0614\nQ\3Q\5Q\u0617\nQ\3"+
		"Q\3Q\3Q\5Q\u061c\nQ\3Q\3Q\5Q\u0620\nQ\3Q\5Q\u0623\nQ\3Q\3Q\3R\3R\3R\5"+
		"R\u062a\nR\3S\3S\3S\3S\5S\u0630\nS\3S\5S\u0633\nS\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\5S\u063d\nS\3T\3T\3T\3T\3T\7T\u0644\nT\fT\16T\u0647\13T\3U\3U\3U"+
		"\3U\5U\u064d\nU\3U\3U\3U\3U\3U\5U\u0654\nU\5U\u0656\nU\3V\3V\3V\3V\5V"+
		"\u065c\nV\3V\5V\u065f\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u066a\nV\3W\3W"+
		"\3W\3W\3W\7W\u0671\nW\fW\16W\u0674\13W\3X\3X\3X\5X\u0679\nX\3Y\3Y\3Y\3"+
		"Y\5Y\u067f\nY\3Y\5Y\u0682\nY\3Y\3Y\3Y\5Y\u0687\nY\3Y\5Y\u068a\nY\3Y\5"+
		"Y\u068d\nY\3Y\5Y\u0690\nY\3Y\5Y\u0693\nY\3Y\3Y\3Y\3Y\5Y\u0699\nY\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\7Z\u06a1\nZ\fZ\16Z\u06a4\13Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u06ac"+
		"\nZ\fZ\16Z\u06af\13Z\5Z\u06b1\nZ\3[\3[\3[\3[\3[\5[\u06b8\n[\3[\3[\3[\5"+
		"[\u06bd\n[\3[\7[\u06c0\n[\f[\16[\u06c3\13[\3[\5[\u06c6\n[\3[\3[\3[\3["+
		"\3[\3[\5[\u06ce\n[\3[\3[\5[\u06d2\n[\3[\7[\u06d5\n[\f[\16[\u06d8\13[\3"+
		"[\5[\u06db\n[\5[\u06dd\n[\3\\\6\\\u06e0\n\\\r\\\16\\\u06e1\3]\3]\3]\3"+
		"]\3]\3]\5]\u06ea\n]\3]\3]\3]\5]\u06ef\n]\3^\3^\3^\3^\5^\u06f5\n^\3^\3"+
		"^\3^\3^\3^\5^\u06fc\n^\3^\5^\u06ff\n^\3_\3_\3_\3`\3`\5`\u0706\n`\3`\3"+
		"`\3`\3`\3`\3`\5`\u070e\n`\3`\3`\3`\3`\7`\u0714\n`\f`\16`\u0717\13`\5`"+
		"\u0719\n`\3`\5`\u071c\n`\3a\3a\3a\5a\u0721\na\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\7b\u072b\nb\fb\16b\u072e\13b\3b\5b\u0731\nb\3b\3b\3b\3c\3c\3d\3d\3d\3"+
		"d\3d\5d\u073d\nd\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3g\3g\3g\3h\3h\3h\5"+
		"h\u0750\nh\3i\3i\3i\3i\3i\5i\u0757\ni\5i\u0759\ni\3i\3i\5i\u075d\ni\3"+
		"i\3i\5i\u0761\ni\3j\3j\3j\3j\7j\u0767\nj\fj\16j\u076a\13j\3j\3j\3k\3k"+
		"\3k\3k\7k\u0772\nk\fk\16k\u0775\13k\3l\3l\3l\3l\7l\u077b\nl\fl\16l\u077e"+
		"\13l\3l\3l\3m\3m\3m\5m\u0785\nm\3m\3m\3m\3m\3n\3n\5n\u078d\nn\3n\3n\5"+
		"n\u0791\nn\3o\3o\3o\3o\3p\3p\5p\u0799\np\3q\3q\3q\3q\3q\3q\3r\3r\3r\3"+
		"r\3s\3s\3s\3s\7s\u07a9\ns\fs\16s\u07ac\13s\3s\3s\3s\3s\3t\3t\3t\3t\3t"+
		"\3u\3u\5u\u07b9\nu\3v\3v\3v\3v\3v\5v\u07c0\nv\3v\3v\5v\u07c4\nv\3w\3w"+
		"\3w\3w\3w\5w\u07cb\nw\5w\u07cd\nw\3x\3x\5x\u07d1\nx\3x\3x\3x\3x\3x\7x"+
		"\u07d8\nx\fx\16x\u07db\13x\3y\3y\3y\3y\3y\5y\u07e2\ny\3z\3z\3z\3z\3z\7"+
		"z\u07e9\nz\fz\16z\u07ec\13z\3z\3z\3{\3{\3{\3|\3|\3|\3|\3|\3|\3}\3}\5}"+
		"\u07fb\n}\3}\3}\3}\3}\5}\u0801\n}\3}\3}\5}\u0805\n}\3~\3~\3~\3~\3~\3~"+
		"\7~\u080d\n~\f~\16~\u0810\13~\3~\3~\3~\7~\u0815\n~\f~\16~\u0818\13~\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\5\177\u0820\n\177\3\177\3\177\5\177"+
		"\u0824\n\177\3\177\3\177\7\177\u0828\n\177\f\177\16\177\u082b\13\177\3"+
		"\u0080\3\u0080\5\u0080\u082f\n\u0080\3\u0081\3\u0081\5\u0081\u0833\n\u0081"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u083d\n\u0082\3\u0083\3\u0083\3\u0084\3\u0084\5\u0084\u0843\n\u0084\3"+
		"\u0085\3\u0085\5\u0085\u0847\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0851\n\u0085\f\u0085\16\u0085"+
		"\u0854\13\u0085\3\u0085\3\u0085\3\u0086\3\u0086\5\u0086\u085a\n\u0086"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\7\u0088\u0868\n\u0088\f\u0088\16\u0088\u086b"+
		"\13\u0088\3\u0088\3\u0088\7\u0088\u086f\n\u0088\f\u0088\16\u0088\u0872"+
		"\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u087b\n\u0089\3\u008a\5\u008a\u087e\n\u008a\3\u008a\3\u008a\5\u008a\u0882"+
		"\n\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u0889\n\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0890\n\u008c\5\u008c"+
		"\u0892\n\u008c\3\u008d\3\u008d\5\u008d\u0896\n\u008d\3\u008e\3\u008e\5"+
		"\u008e\u089a\n\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u089f\n\u008f\3\u0090"+
		"\5\u0090\u08a2\n\u0090\3\u0090\3\u0090\5\u0090\u08a6\n\u0090\3\u0090\5"+
		"\u0090\u08a9\n\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3"+
		"\u0092\3\u0092\3\u0092\5\u0092\u08b4\n\u0092\3\u0092\5\u0092\u08b7\n\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\5\u0094\u08c2\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u08c8\n"+
		"\u0094\3\u0094\3\u0094\5\u0094\u08cc\n\u0094\5\u0094\u08ce\n\u0094\3\u0095"+
		"\3\u0095\5\u0095\u08d2\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0097\3\u0097\5\u0097\u08db\n\u0097\3\u0097\3\u0097\3\u0097\7\u0097"+
		"\u08e0\n\u0097\f\u0097\16\u0097\u08e3\13\u0097\3\u0097\5\u0097\u08e6\n"+
		"\u0097\3\u0097\3\u0097\5\u0097\u08ea\n\u0097\3\u0097\3\u0097\3\u0097\7"+
		"\u0097\u08ef\n\u0097\f\u0097\16\u0097\u08f2\13\u0097\3\u0097\5\u0097\u08f5"+
		"\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u08fd"+
		"\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0903\n\u0099\3\u0099"+
		"\3\u0099\5\u0099\u0907\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0912\n\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\5\u009a\u0919\n\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b"+
		"\u0926\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u092c\n\u009c\f"+
		"\u009c\16\u009c\u092f\13\u009c\3\u009d\5\u009d\u0932\n\u009d\3\u009d\3"+
		"\u009d\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u093a\n\u009e\f\u009e\16"+
		"\u009e\u093d\13\u009e\3\u009f\3\u009f\5\u009f\u0941\n\u009f\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0"+
		"\u094c\n\u00a0\f\u00a0\16\u00a0\u094f\13\u00a0\3\u00a0\3\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u0957\n\u00a1\f\u00a1\16\u00a1\u095a"+
		"\13\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0961\n\u00a2"+
		"\3\u00a3\3\u00a3\5\u00a3\u0965\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u0969\n"+
		"\u00a3\3\u00a3\3\u00a3\5\u00a3\u096d\n\u00a3\5\u00a3\u096f\n\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a4\5\u00a4\u0974\n\u00a4\3\u00a4\5\u00a4\u0977\n\u00a4\3"+
		"\u00a4\5\u00a4\u097a\n\u00a4\3\u00a4\5\u00a4\u097d\n\u00a4\3\u00a4\3\u00a4"+
		"\5\u00a4\u0981\n\u00a4\3\u00a4\5\u00a4\u0984\n\u00a4\3\u00a4\5\u00a4\u0987"+
		"\n\u00a4\3\u00a5\5\u00a5\u098a\n\u00a5\3\u00a5\5\u00a5\u098d\n\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\7\u00a5\u0992\n\u00a5\f\u00a5\16\u00a5\u0995\13"+
		"\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8"+
		"\5\u00a8\u099f\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u09a3\n\u00a8\3\u00a8\5"+
		"\u00a8\u09a6\n\u00a8\3\u00a9\3\u00a9\5\u00a9\u09aa\n\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09b1\n\u00a9\3\u00aa\3\u00aa\5\u00aa"+
		"\u09b5\n\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab"+
		"\u09bd\n\u00ab\f\u00ab\16\u00ab\u09c0\13\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\7\u00ac\u09c5\n\u00ac\f\u00ac\16\u00ac\u09c8\13\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\5\u00ad\u09cd\n\u00ad\3\u00ae\3\u00ae\5\u00ae\u09d1\n\u00ae\3"+
		"\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u09d7\n\u00af\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u09e0\n\u00b0\3\u00b1\5"+
		"\u00b1\u09e3\n\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u09e8\n\u00b1\3\u00b1"+
		"\5\u00b1\u09eb\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\7\u00b2\u09f3\n\u00b2\f\u00b2\16\u00b2\u09f6\13\u00b2\3\u00b2\3\u00b2"+
		"\5\u00b2\u09fa\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3"+
		"\u0a01\n\u00b3\f\u00b3\16\u00b3\u0a04\13\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u0a08\n\u00b3\3\u00b4\3\u00b4\5\u00b4\u0a0c\n\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b4\7\u00b4\u0a13\n\u00b4\f\u00b4\16\u00b4\u0a16\13"+
		"\u00b4\3\u00b4\5\u00b4\u0a19\n\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3"+
		"\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u0a25\n\u00b7\f"+
		"\u00b7\16\u00b7\u0a28\13\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0a34\n\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\5\u00ba\u0a39\n\u00ba\7\u00ba\u0a3b\n\u00ba\f\u00ba\16"+
		"\u00ba\u0a3e\13\u00ba\3\u00bb\6\u00bb\u0a41\n\u00bb\r\u00bb\16\u00bb\u0a42"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u0a4e\n\u00bc\5\u00bc\u0a50\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u0a57\n\u00bd\3\u00bd\5\u00bd\u0a5a\n\u00bd\3\u00be"+
		"\3\u00be\3\u00be\7\u00be\u0a5f\n\u00be\f\u00be\16\u00be\u0a62\13\u00be"+
		"\3\u00bf\3\u00bf\5\u00bf\u0a66\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\5\u00bf\u0a6c\n\u00bf\3\u00bf\5\u00bf\u0a6f\n\u00bf\3\u00bf\5\u00bf\u0a72"+
		"\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\6\u00c1\u0a7f\n\u00c1\r\u00c1\16\u00c1\u0a80"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0a88\n\u00c2\3\u00c2"+
		"\5\u00c2\u0a8b\n\u00c2\3\u00c2\5\u00c2\u0a8e\n\u00c2\3\u00c3\3\u00c3\5"+
		"\u00c3\u0a92\n\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0a97\n\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0a9d\n\u00c3\3\u00c4\3\u00c4\5\u00c4"+
		"\u0aa1\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\7\u00c4\u0aaa\n\u00c4\f\u00c4\16\u00c4\u0aad\13\u00c4\3\u00c4\5\u00c4"+
		"\u0ab0\n\u00c4\3\u00c4\5\u00c4\u0ab3\n\u00c4\3\u00c5\3\u00c5\5\u00c5\u0ab7"+
		"\n\u00c5\3\u00c5\3\u00c5\5\u00c5\u0abb\n\u00c5\3\u00c5\3\u00c5\5\u00c5"+
		"\u0abf\n\u00c5\3\u00c6\3\u00c6\5\u00c6\u0ac3\n\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c7\3\u00c7\5\u00c7\u0ac9\n\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\5"+
		"\u00c8\u0acf\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0ad6"+
		"\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\7\u00c8\u0adc\n\u00c8\f\u00c8"+
		"\16\u00c8\u0adf\13\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0ae4\n\u00c9"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0ae9\n\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0af4\n\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0afd"+
		"\n\u00ca\3\u00cb\3\u00cb\5\u00cb\u0b01\n\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\7\u00cb\u0b08\n\u00cb\f\u00cb\16\u00cb\u0b0b\13\u00cb"+
		"\3\u00cb\5\u00cb\u0b0e\n\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\7\u00cc\u0b16\n\u00cc\f\u00cc\16\u00cc\u0b19\13\u00cc\3\u00cc"+
		"\3\u00cc\5\u00cc\u0b1d\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0b33\n\u00cf"+
		"\3\u00cf\5\u00cf\u0b36\n\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0b49\n\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\7\u00d0\u0b59\n\u00d0\f\u00d0\16\u00d0\u0b5c\13\u00d0"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1"+
		"\u0b66\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u0b73\n\u00d4\f\u00d4\16\u00d4"+
		"\u0b76\13\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\5\u00d5\u0b81\n\u00d5\3\u00d6\3\u00d6\5\u00d6\u0b85\n"+
		"\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\6\u00d7"+
		"\u0b8e\n\u00d7\r\u00d7\16\u00d7\u0b8f\3\u00d7\3\u00d7\5\u00d7\u0b94\n"+
		"\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\6\u00d8\u0b9e\n\u00d8\r\u00d8\16\u00d8\u0b9f\3\u00d8\3\u00d8\5\u00d8"+
		"\u0ba4\n\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da"+
		"\3\u00da\3\u00da\5\u00da\u0baf\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da"+
		"\u0bb4\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0bb9\n\u00da\3\u00da\3"+
		"\u00da\5\u00da\u0bbd\n\u00da\3\u00da\3\u00da\5\u00da\u0bc1\n\u00da\3\u00da"+
		"\3\u00da\3\u00da\5\u00da\u0bc6\n\u00da\3\u00da\3\u00da\5\u00da\u0bca\n"+
		"\u00da\3\u00da\3\u00da\5\u00da\u0bce\n\u00da\3\u00da\3\u00da\3\u00da\3"+
		"\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\5\u00da\u0be5\n\u00da\5\u00da\u0be7\n\u00da\3\u00da\3\u00da\3\u00da\3"+
		"\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0bf9\n\u00da\5\u00da\u0bfb\n"+
		"\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0c03\n"+
		"\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0c08\n\u00da\3\u00da\3\u00da\3"+
		"\u00da\5\u00da\u0c0d\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0c12\n\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\5\u00da\u0c1f\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da"+
		"\u0c24\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0c29\n\u00da\3\u00da\3"+
		"\u00da\3\u00da\5\u00da\u0c2e\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0c33"+
		"\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0c38\n\u00da\3\u00da\3\u00da"+
		"\3\u00da\5\u00da\u0c3d\n\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0c42\n"+
		"\u00da\5\u00da\u0c44\n\u00da\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\5"+
		"\u00dc\u0c4b\n\u00dc\3\u00dc\5\u00dc\u0c4e\n\u00dc\3\u00dc\3\u00dc\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0c57\n\u00dd\f\u00dd\16\u00dd"+
		"\u0c5a\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\5\u00de\u0c63\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\5\u00de\u0c6b\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\5\u00de\u0c74\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de"+
		"\u0c7a\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0c89\n\u00de"+
		"\f\u00de\16\u00de\u0c8c\13\u00de\5\u00de\u0c8e\n\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\7\u00de\u0c9c\n\u00de\f\u00de\16\u00de\u0c9f\13\u00de\5\u00de"+
		"\u0ca1\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0caf\n\u00de\f\u00de"+
		"\16\u00de\u0cb2\13\u00de\5\u00de\u0cb4\n\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\7\u00de\u0cc2\n\u00de\f\u00de\16\u00de\u0cc5\13\u00de\5\u00de\u0cc7\n"+
		"\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0cd5\n\u00de\f\u00de\16\u00de"+
		"\u0cd8\13\u00de\5\u00de\u0cda\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de"+
		"\u0ce8\n\u00de\f\u00de\16\u00de\u0ceb\13\u00de\5\u00de\u0ced\n\u00de\3"+
		"\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\7\u00de\u0cf9\n\u00de\f\u00de\16\u00de\u0cfc\13\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\6\u00de\u0d08\n\u00de\r\u00de\16\u00de\u0d09\3\u00de\3\u00de\5\u00de"+
		"\u0d0e\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u0d1e"+
		"\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u0d24\n\u00de\3\u00df"+
		"\3\u00df\3\u00df\5\u00df\u0d29\n\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0"+
		"\3\u00e0\7\u00e0\u0d30\n\u00e0\f\u00e0\16\u00e0\u0d33\13\u00e0\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0d39\n\u00e1\5\u00e1\u0d3b\n\u00e1\3"+
		"\u00e1\3\u00e1\3\u00e2\3\u00e2\5\u00e2\u0d41\n\u00e2\3\u00e3\3\u00e3\5"+
		"\u00e3\u0d45\n\u00e3\3\u00e4\3\u00e4\7\u00e4\u0d49\n\u00e4\f\u00e4\16"+
		"\u00e4\u0d4c\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0d5a\n\u00e5"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0d61\n\u00e6\3\u00e7"+
		"\7\u00e7\u0d64\n\u00e7\f\u00e7\16\u00e7\u0d67\13\u00e7\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0d70\n\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\7\u00e9\u0d75\n\u00e9\f\u00e9\16\u00e9\u0d78\13\u00e9"+
		"\5\u00e9\u0d7a\n\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00ec\3\u00ec\5\u00ec\u0d84\n\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec"+
		"\u0d89\n\u00ec\7\u00ec\u0d8b\n\u00ec\f\u00ec\16\u00ec\u0d8e\13\u00ec\3"+
		"\u00ed\3\u00ed\5\u00ed\u0d92\n\u00ed\3\u00ee\5\u00ee\u0d95\n\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ef\5\u00ef\u0d9a\n\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0"+
		"\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u0d65\4\u018e\u019e\u00f3\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de"+
		"\u01e0\u01e2\2\65\5\2\3\4\u0161\u0161\u0172\u0172\4\2gg\u013c\u013c\3"+
		"\2\u00ad\u00ae\5\2\23\23xx\u009e\u009e\4\2&&..\4\2<<pp\4\2\u00bd\u00bd"+
		"\u0105\u0105\6\2\n\nww\u0095\u0095\u011a\u011a\3\2\u0167\u016a\4\2\24"+
		"\24XX\4\2UU\u0131\u0131\4\2qq\u00b0\u00b0\4\2UU\u00dd\u00dd\4\2QQ\u008d"+
		"\u008d\5\2\u0091\u0091\u00b7\u00b7\u00d9\u00da\4\2\u00b2\u00b2\u00c4\u00c4"+
		"\4\2\u00c1\u00c1\u0144\u0144\4\2\u00f8\u00f8\u012e\u012e\4\2\u00b6\u00b6"+
		"\u0177\u0177\4\2$$++\4\2))CC\4\2GG\u00fe\u00fe\4\2\23\23\u009e\u009e\3"+
		"\2\u00ef\u00f0\3\2\u00e0\u00e1\6\2BBSS\u009d\u009d\u00d6\u00d6\3\2kl\3"+
		"\2de\3\2\u0115\u0116\4\2\u00f9\u00f9\u011d\u011d\5\2UU\u008c\u008c\u00d5"+
		"\u00d5\6\2\21\22\u00c2\u00c2\u00e5\u00e5\u0142\u0142\3\2\u00cc\u00cd\4"+
		"\2\u0106\u0106\u012b\u012b\6\2\32\32__\u00b3\u00b3\u0125\u0125\4\2\u00b3"+
		"\u00b3\u013e\u013e\4\2##\u0117\u0117\3\2\u0103\u0104\4\2\r\r]]\5\2}}\u00a7"+
		"\u00a7\u00f2\u00f2\5\2CC\u00fa\u00fb\u0132\u0132\5\2nn\u0109\u0109\u0131"+
		"\u0131\3\2XY\4\2\20\20\u00d0\u00d0\5\2\u00a8\u00a8\u00e9\u00e9\u00f3\u00f3"+
		"\5\2KL\u00ba\u00bb\u00ff\u0100\4\299\u0160\u0160\5\2{{\u009f\u009f\u00c7"+
		"\u00c7\4\2\u015d\u015d\u0173\u0173\4\2rr\u012c\u012c\16\2\13\36 bffh\u00c7"+
		"\u00c9\u00da\u00dc\u00f7\u00f9\u010c\u010e\u0126\u0128\u012d\u0130\u013b"+
		"\u013e\u014e\u0155\u015c\2\u0f52\2\u01e4\3\2\2\2\4\u01ee\3\2\2\2\6\u01f3"+
		"\3\2\2\2\b\u0207\3\2\2\2\n\u0209\3\2\2\2\f\u0215\3\2\2\2\16\u0257\3\2"+
		"\2\2\20\u0259\3\2\2\2\22\u025b\3\2\2\2\24\u0261\3\2\2\2\26\u0267\3\2\2"+
		"\2\30\u0269\3\2\2\2\32\u0279\3\2\2\2\34\u027e\3\2\2\2\36\u0290\3\2\2\2"+
		" \u0292\3\2\2\2\"\u02b7\3\2\2\2$\u02c1\3\2\2\2&\u02cc\3\2\2\2(\u02e0\3"+
		"\2\2\2*\u02e3\3\2\2\2,\u02e5\3\2\2\2.\u02ef\3\2\2\2\60\u02f8\3\2\2\2\62"+
		"\u0303\3\2\2\2\64\u0312\3\2\2\2\66\u0337\3\2\2\28\u0339\3\2\2\2:\u0341"+
		"\3\2\2\2<\u034c\3\2\2\2>\u0355\3\2\2\2@\u0358\3\2\2\2B\u0365\3\2\2\2D"+
		"\u036f\3\2\2\2F\u037c\3\2\2\2H\u039b\3\2\2\2J\u03a3\3\2\2\2L\u03c1\3\2"+
		"\2\2N\u03c3\3\2\2\2P\u03c5\3\2\2\2R\u03c7\3\2\2\2T\u03c9\3\2\2\2V\u03d5"+
		"\3\2\2\2X\u03d7\3\2\2\2Z\u03f6\3\2\2\2\\\u03f8\3\2\2\2^\u0403\3\2\2\2"+
		"`\u0409\3\2\2\2b\u0437\3\2\2\2d\u0439\3\2\2\2f\u043e\3\2\2\2h\u0440\3"+
		"\2\2\2j\u0462\3\2\2\2l\u049d\3\2\2\2n\u049f\3\2\2\2p\u04ac\3\2\2\2r\u04b3"+
		"\3\2\2\2t\u04b6\3\2\2\2v\u04ba\3\2\2\2x\u04bd\3\2\2\2z\u04c9\3\2\2\2|"+
		"\u04dd\3\2\2\2~\u0500\3\2\2\2\u0080\u0514\3\2\2\2\u0082\u0516\3\2\2\2"+
		"\u0084\u0518\3\2\2\2\u0086\u0533\3\2\2\2\u0088\u0539\3\2\2\2\u008a\u0556"+
		"\3\2\2\2\u008c\u0558\3\2\2\2\u008e\u055d\3\2\2\2\u0090\u055f\3\2\2\2\u0092"+
		"\u05a4\3\2\2\2\u0094\u05d3\3\2\2\2\u0096\u05d5\3\2\2\2\u0098\u05eb\3\2"+
		"\2\2\u009a\u05f9\3\2\2\2\u009c\u05fb\3\2\2\2\u009e\u060d\3\2\2\2\u00a0"+
		"\u0616\3\2\2\2\u00a2\u0626\3\2\2\2\u00a4\u0632\3\2\2\2\u00a6\u063e\3\2"+
		"\2\2\u00a8\u0655\3\2\2\2\u00aa\u065e\3\2\2\2\u00ac\u066b\3\2\2\2\u00ae"+
		"\u0678\3\2\2\2\u00b0\u0681\3\2\2\2\u00b2\u06b0\3\2\2\2\u00b4\u06dc\3\2"+
		"\2\2\u00b6\u06df\3\2\2\2\u00b8\u06ee\3\2\2\2\u00ba\u06fe\3\2\2\2\u00bc"+
		"\u0700\3\2\2\2\u00be\u0703\3\2\2\2\u00c0\u0720\3\2\2\2\u00c2\u0722\3\2"+
		"\2\2\u00c4\u0735\3\2\2\2\u00c6\u0737\3\2\2\2\u00c8\u073e\3\2\2\2\u00ca"+
		"\u0744\3\2\2\2\u00cc\u0749\3\2\2\2\u00ce\u074c\3\2\2\2\u00d0\u0751\3\2"+
		"\2\2\u00d2\u0762\3\2\2\2\u00d4\u076d\3\2\2\2\u00d6\u0776\3\2\2\2\u00d8"+
		"\u0781\3\2\2\2\u00da\u078a\3\2\2\2\u00dc\u0792\3\2\2\2\u00de\u0798\3\2"+
		"\2\2\u00e0\u079a\3\2\2\2\u00e2\u07a0\3\2\2\2\u00e4\u07a4\3\2\2\2\u00e6"+
		"\u07b1\3\2\2\2\u00e8\u07b6\3\2\2\2\u00ea\u07ba\3\2\2\2\u00ec\u07c5\3\2"+
		"\2\2\u00ee\u07ce\3\2\2\2\u00f0\u07dc\3\2\2\2\u00f2\u07e3\3\2\2\2\u00f4"+
		"\u07ef\3\2\2\2\u00f6\u07f2\3\2\2\2\u00f8\u0800\3\2\2\2\u00fa\u0806\3\2"+
		"\2\2\u00fc\u0819\3\2\2\2\u00fe\u082e\3\2\2\2\u0100\u0832\3\2\2\2\u0102"+
		"\u083c\3\2\2\2\u0104\u083e\3\2\2\2\u0106\u0840\3\2\2\2\u0108\u0844\3\2"+
		"\2\2\u010a\u0857\3\2\2\2\u010c\u085b\3\2\2\2\u010e\u085d\3\2\2\2\u0110"+
		"\u087a\3\2\2\2\u0112\u087d\3\2\2\2\u0114\u0883\3\2\2\2\u0116\u0885\3\2"+
		"\2\2\u0118\u0893\3\2\2\2\u011a\u0897\3\2\2\2\u011c\u089e\3\2\2\2\u011e"+
		"\u08a5\3\2\2\2\u0120\u08ac\3\2\2\2\u0122\u08af\3\2\2\2\u0124\u08bb\3\2"+
		"\2\2\u0126\u08be\3\2\2\2\u0128\u08cf\3\2\2\2\u012a\u08d5\3\2\2\2\u012c"+
		"\u08d8\3\2\2\2\u012e\u08f6\3\2\2\2\u0130\u08fe\3\2\2\2\u0132\u090d\3\2"+
		"\2\2\u0134\u0925\3\2\2\2\u0136\u0927\3\2\2\2\u0138\u0931\3\2\2\2\u013a"+
		"\u0935\3\2\2\2\u013c\u093e\3\2\2\2\u013e\u0947\3\2\2\2\u0140\u0952\3\2"+
		"\2\2\u0142\u0960\3\2\2\2\u0144\u096e\3\2\2\2\u0146\u0970\3\2\2\2\u0148"+
		"\u0989\3\2\2\2\u014a\u0996\3\2\2\2\u014c\u0998\3\2\2\2\u014e\u09a5\3\2"+
		"\2\2\u0150\u09b0\3\2\2\2\u0152\u09b4\3\2\2\2\u0154\u09b8\3\2\2\2\u0156"+
		"\u09c1\3\2\2\2\u0158\u09cc\3\2\2\2\u015a\u09ce\3\2\2\2\u015c\u09d2\3\2"+
		"\2\2\u015e\u09df\3\2\2\2\u0160\u09ea\3\2\2\2\u0162\u09ec\3\2\2\2\u0164"+
		"\u0a07\3\2\2\2\u0166\u0a09\3\2\2\2\u0168\u0a1a\3\2\2\2\u016a\u0a1c\3\2"+
		"\2\2\u016c\u0a1f\3\2\2\2\u016e\u0a29\3\2\2\2\u0170\u0a2c\3\2\2\2\u0172"+
		"\u0a2f\3\2\2\2\u0174\u0a40\3\2\2\2\u0176\u0a4f\3\2\2\2\u0178\u0a51\3\2"+
		"\2\2\u017a\u0a5b\3\2\2\2\u017c\u0a6b\3\2\2\2\u017e\u0a73\3\2\2\2\u0180"+
		"\u0a76\3\2\2\2\u0182\u0a87\3\2\2\2\u0184\u0a9c\3\2\2\2\u0186\u0ab2\3\2"+
		"\2\2\u0188\u0ab4\3\2\2\2\u018a\u0ac0\3\2\2\2\u018c\u0ac6\3\2\2\2\u018e"+
		"\u0ad5\3\2\2\2\u0190\u0ae3\3\2\2\2\u0192\u0afc\3\2\2\2\u0194\u0afe\3\2"+
		"\2\2\u0196\u0b11\3\2\2\2\u0198\u0b23\3\2\2\2\u019a\u0b27\3\2\2\2\u019c"+
		"\u0b35\3\2\2\2\u019e\u0b48\3\2\2\2\u01a0\u0b65\3\2\2\2\u01a2\u0b67\3\2"+
		"\2\2\u01a4\u0b6b\3\2\2\2\u01a6\u0b6d\3\2\2\2\u01a8\u0b80\3\2\2\2\u01aa"+
		"\u0b84\3\2\2\2\u01ac\u0b86\3\2\2\2\u01ae\u0b97\3\2\2\2\u01b0\u0ba7\3\2"+
		"\2\2\u01b2\u0c43\3\2\2\2\u01b4\u0c45\3\2\2\2\u01b6\u0c47\3\2\2\2\u01b8"+
		"\u0c51\3\2\2\2\u01ba\u0d23\3\2\2\2\u01bc\u0d25\3\2\2\2\u01be\u0d2c\3\2"+
		"\2\2\u01c0\u0d34\3\2\2\2\u01c2\u0d40\3\2\2\2\u01c4\u0d44\3\2\2\2\u01c6"+
		"\u0d46\3\2\2\2\u01c8\u0d59\3\2\2\2\u01ca\u0d60\3\2\2\2\u01cc\u0d65\3\2"+
		"\2\2\u01ce\u0d68\3\2\2\2\u01d0\u0d79\3\2\2\2\u01d2\u0d7b\3\2\2\2\u01d4"+
		"\u0d7e\3\2\2\2\u01d6\u0d83\3\2\2\2\u01d8\u0d91\3\2\2\2\u01da\u0d94\3\2"+
		"\2\2\u01dc\u0d99\3\2\2\2\u01de\u0d9d\3\2\2\2\u01e0\u0d9f\3\2\2\2\u01e2"+
		"\u0da1\3\2\2\2\u01e4\u01e5\5\4\3\2\u01e5\u01e6\7\2\2\3\u01e6\3\3\2\2\2"+
		"\u01e7\u01ea\5\6\4\2\u01e8\u01ea\5\16\b\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8"+
		"\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01ed\7\u0081\2\2\u01ec\u01eb\3\2\2"+
		"\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\5\3\2\2\2\u01f2"+
		"\u01f4\5\60\31\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3"+
		"\2\2\2\u01f5\u01f6\7\32\2\2\u01f6\u01f8\5\4\3\2\u01f7\u01f9\5\22\n\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\5\n"+
		"\6\2\u01fb\7\3\2\2\2\u01fc\u01fd\7\32\2\2\u01fd\u01ff\5\4\3\2\u01fe\u0200"+
		"\5\22\n\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2"+
		"\u0201\u0202\5\n\6\2\u0202\u0208\3\2\2\2\u0203\u0205\5\16\b\2\u0204\u0206"+
		"\7\u0172\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2"+
		"\2\u0207\u01fc\3\2\2\2\u0207\u0203\3\2\2\2\u0208\t\3\2\2\2\u0209\u020a"+
		"\6\6\2\2\u020a\u020b\7g\2\2\u020b\13\3\2\2\2\u020c\u0216\5\6\4\2\u020d"+
		"\u020f\5\16\b\2\u020e\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3"+
		"\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0214\7\u0081\2\2"+
		"\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u020c"+
		"\3\2\2\2\u0215\u020e\3\2\2\2\u0216\r\3\2\2\2\u0217\u0258\5\\/\2\u0218"+
		"\u0258\5T+\2\u0219\u0258\5\32\16\2\u021a\u0258\5$\23\2\u021b\u0258\5\u008c"+
		"G\2\u021c\u0258\5&\24\2\u021d\u0258\5(\25\2\u021e\u0258\5*\26\2\u021f"+
		"\u0258\5,\27\2\u0220\u0258\5\u00f0y\2\u0221\u0258\5\u00f4{\2\u0222\u0258"+
		"\5\u00f6|\2\u0223\u0258\5\u00fa~\2\u0224\u0258\5\u00fc\177\2\u0225\u0258"+
		"\5\u0106\u0084\2\u0226\u0258\5\u009cO\2\u0227\u0258\5\u00a0Q\2\u0228\u0258"+
		"\5\u0108\u0085\2\u0229\u0258\5F$\2\u022a\u0258\5\u00a4S\2\u022b\u0258"+
		"\5\u00aaV\2\u022c\u0258\5\u00b0Y\2\u022d\u0258\5D#\2\u022e\u0258\5.\30"+
		"\2\u022f\u0258\5\u0188\u00c5\2\u0230\u0258\5\u018c\u00c7\2\u0231\u0258"+
		"\5\u00ba^\2\u0232\u0258\5\u00bc_\2\u0233\u0258\5\u00be`\2\u0234\u0258"+
		"\5\u00dan\2\u0235\u0258\5\u00eex\2\u0236\u0258\5\u0130\u0099\2\u0237\u0258"+
		"\5\u0132\u009a\2\u0238\u0258\5\u00c0a\2\u0239\u0258\5\u00ceh\2\u023a\u0258"+
		"\5\u00d0i\2\u023b\u0258\5\u00d8m\2\u023c\u0258\5\u00dco\2\u023d\u0258"+
		"\5\u00e4s\2\u023e\u0258\5\u00e8u\2\u023f\u0258\5\u00eav\2\u0240\u0258"+
		"\5\u0180\u00c1\2\u0241\u0258\5\u00ecw\2\u0242\u0258\5\u0110\u0089\2\u0243"+
		"\u0258\5\u0112\u008a\2\u0244\u0258\5\u0114\u008b\2\u0245\u0258\5\u0116"+
		"\u008c\2\u0246\u0258\5\u0118\u008d\2\u0247\u0258\5\u011a\u008e\2\u0248"+
		"\u0258\5\u0138\u009d\2\u0249\u0258\5\u0124\u0093\2\u024a\u0258\5\u0126"+
		"\u0094\2\u024b\u0258\5\u0178\u00bd\2\u024c\u0258\5\u012a\u0096\2\u024d"+
		"\u0258\5\u0128\u0095\2\u024e\u0258\5\u012c\u0097\2\u024f\u0258\5\u012e"+
		"\u0098\2\u0250\u0258\5\u0134\u009b\2\u0251\u0258\5\u01c6\u00e4\2\u0252"+
		"\u0258\5\u01ca\u00e6\2\u0253\u0258\5\26\f\2\u0254\u0258\5\30\r\2\u0255"+
		"\u0258\5X-\2\u0256\u0258\5\20\t\2\u0257\u0217\3\2\2\2\u0257\u0218\3\2"+
		"\2\2\u0257\u0219\3\2\2\2\u0257\u021a\3\2\2\2\u0257\u021b\3\2\2\2\u0257"+
		"\u021c\3\2\2\2\u0257\u021d\3\2\2\2\u0257\u021e\3\2\2\2\u0257\u021f\3\2"+
		"\2\2\u0257\u0220\3\2\2\2\u0257\u0221\3\2\2\2\u0257\u0222\3\2\2\2\u0257"+
		"\u0223\3\2\2\2\u0257\u0224\3\2\2\2\u0257\u0225\3\2\2\2\u0257\u0226\3\2"+
		"\2\2\u0257\u0227\3\2\2\2\u0257\u0228\3\2\2\2\u0257\u0229\3\2\2\2\u0257"+
		"\u022a\3\2\2\2\u0257\u022b\3\2\2\2\u0257\u022c\3\2\2\2\u0257\u022d\3\2"+
		"\2\2\u0257\u022e\3\2\2\2\u0257\u022f\3\2\2\2\u0257\u0230\3\2\2\2\u0257"+
		"\u0231\3\2\2\2\u0257\u0232\3\2\2\2\u0257\u0233\3\2\2\2\u0257\u0234\3\2"+
		"\2\2\u0257\u0235\3\2\2\2\u0257\u0236\3\2\2\2\u0257\u0237\3\2\2\2\u0257"+
		"\u0238\3\2\2\2\u0257\u0239\3\2\2\2\u0257\u023a\3\2\2\2\u0257\u023b\3\2"+
		"\2\2\u0257\u023c\3\2\2\2\u0257\u023d\3\2\2\2\u0257\u023e\3\2\2\2\u0257"+
		"\u023f\3\2\2\2\u0257\u0240\3\2\2\2\u0257\u0241\3\2\2\2\u0257\u0242\3\2"+
		"\2\2\u0257\u0243\3\2\2\2\u0257\u0244\3\2\2\2\u0257\u0245\3\2\2\2\u0257"+
		"\u0246\3\2\2\2\u0257\u0247\3\2\2\2\u0257\u0248\3\2\2\2\u0257\u0249\3\2"+
		"\2\2\u0257\u024a\3\2\2\2\u0257\u024b\3\2\2\2\u0257\u024c\3\2\2\2\u0257"+
		"\u024d\3\2\2\2\u0257\u024e\3\2\2\2\u0257\u024f\3\2\2\2\u0257\u0250\3\2"+
		"\2\2\u0257\u0251\3\2\2\2\u0257\u0252\3\2\2\2\u0257\u0253\3\2\2\2\u0257"+
		"\u0254\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0256\3\2\2\2\u0258\17\3\2\2"+
		"\2\u0259\u025a\t\2\2\2\u025a\21\3\2\2\2\u025b\u025d\7m\2\2\u025c\u025e"+
		"\5\24\13\2\u025d\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u025d\3\2\2\2"+
		"\u025f\u0260\3\2\2\2\u0260\23\3\2\2\2\u0261\u0262\7\u013c\2\2\u0262\u0263"+
		"\7\u0174\2\2\u0263\u0264\7\u0125\2\2\u0264\u0265\5\4\3\2\u0265\u0266\n"+
		"\3\2\2\u0266\25\3\2\2\2\u0267\u0268\7\u00c8\2\2\u0268\27\3\2\2\2\u0269"+
		"\u026a\6\r\3\2\u026a\u026b\5\u019e\u00d0\2\u026b\31\3\2\2\2\u026c\u026d"+
		"\7\u0105\2\2\u026d\u027a\5\u011c\u008f\2\u026e\u0270\7\u0105\2\2\u026f"+
		"\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0276\5\34"+
		"\17\2\u0272\u0273\7\u015f\2\2\u0273\u0275\5\34\17\2\u0274\u0272\3\2\2"+
		"\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u026c\3\2\2\2\u0279\u026f\3\2\2\2\u027a"+
		"\33\3\2\2\2\u027b\u027f\5\36\20\2\u027c\u027f\5 \21\2\u027d\u027f\5\""+
		"\22\2\u027e\u027b\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027f"+
		"\35\3\2\2\2\u0280\u0282\5\u01d6\u00ec\2\u0281\u0283\7\u015e\2\2\u0282"+
		"\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\7\u0163"+
		"\2\2\u0285\u0286\5\u019e\u00d0\2\u0286\u0291\3\2\2\2\u0287\u0288\7\u016d"+
		"\2\2\u0288\u0289\5\u01d6\u00ec\2\u0289\u028b\7\u0170\2\2\u028a\u028c\7"+
		"\u015e\2\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2"+
		"\u028d\u028e\7\u0163\2\2\u028e\u028f\5\u019e\u00d0\2\u028f\u0291\3\2\2"+
		"\2\u0290\u0280\3\2\2\2\u0290\u0287\3\2\2\2\u0291\37\3\2\2\2\u0292\u0293"+
		"\7\u016d\2\2\u0293\u0298\5\u01d6\u00ec\2\u0294\u0295\7\u015f\2\2\u0295"+
		"\u0297\5\u01d6\u00ec\2\u0296\u0294\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b"+
		"\u029d\7\u0170\2\2\u029c\u029e\7\u015e\2\2\u029d\u029c\3\2\2\2\u029d\u029e"+
		"\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7\u0163\2\2\u02a0\u02a1\7\u016d"+
		"\2\2\u02a1\u02a6\5\u019e\u00d0\2\u02a2\u02a3\7\u015f\2\2\u02a3\u02a5\5"+
		"\u019e\u00d0\2\u02a4\u02a2\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9"+
		"\u02aa\7\u0170\2\2\u02aa!\3\2\2\2\u02ab\u02b8\5\u01d6\u00ec\2\u02ac\u02ad"+
		"\7\u016d\2\2\u02ad\u02b2\5\u01d6\u00ec\2\u02ae\u02af\7\u015f\2\2\u02af"+
		"\u02b1\5\u01d6\u00ec\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5"+
		"\u02b6\7\u0170\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02ab\3\2\2\2\u02b7\u02ac"+
		"\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02bb\7\u015e\2\2\u02ba\u02b9\3\2\2"+
		"\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\7\u0163\2\2\u02bd"+
		"\u02be\7\u016d\2\2\u02be\u02bf\5\u0138\u009d\2\u02bf\u02c0\7\u0170\2\2"+
		"\u02c0#\3\2\2\2\u02c1\u02c2\7\16\2\2\u02c2\u02c3\5\u01d6\u00ec\2\u02c3"+
		"\u02c4\7F\2\2\u02c4\u02c8\7x\2\2\u02c5\u02c6\7\u00ed\2\2\u02c6\u02c9\7"+
		"\u0105\2\2\u02c7\u02c9\7\u00e1\2\2\u02c8\u02c5\3\2\2\2\u02c8\u02c7\3\2"+
		"\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\5\u01d6\u00ec\2\u02cb%\3\2\2\2\u02cc"+
		"\u02cf\7\25\2\2\u02cd\u02ce\7\u00ed\2\2\u02ce\u02d0\7\u0105\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\t\4"+
		"\2\2\u02d2\u02d3\7\u016d\2\2\u02d3\u02d8\5\u01d6\u00ec\2\u02d4\u02d5\7"+
		"\u015f\2\2\u02d5\u02d7\5\u01d6\u00ec\2\u02d6\u02d4\3\2\2\2\u02d7\u02da"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da"+
		"\u02d8\3\2\2\2\u02db\u02dc\7\u0170\2\2\u02dc\u02dd\7\u013f\2\2\u02dd\u02de"+
		"\7\u00e1\2\2\u02de\u02df\5\u01d6\u00ec\2\u02df\'\3\2\2\2\u02e0\u02e1\7"+
		"\32\2\2\u02e1\u02e2\7\u012b\2\2\u02e2)\3\2\2\2\u02e3\u02e4\7\"\2\2\u02e4"+
		"+\3\2\2\2\u02e5\u02e6\7%\2\2\u02e6\u02ed\5\u01d6\u00ec\2\u02e7\u02e9\7"+
		"\u016d\2\2\u02e8\u02ea\5\u01be\u00e0\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ee\7\u0170\2\2\u02ec\u02ee\5\u01be"+
		"\u00e0\2\u02ed\u02e7\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"-\3\2\2\2\u02ef\u02f0\7O\2\2\u02f0\u02f5\5\64\33\2\u02f1\u02f2\7\u015f"+
		"\2\2\u02f2\u02f4\5\64\33\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6/\3\2\2\2\u02f7\u02f5\3\2\2\2"+
		"\u02f8\u02f9\7O\2\2\u02f9\u02fa\5\64\33\2\u02fa\u0300\7\u0172\2\2\u02fb"+
		"\u02fc\5\64\33\2\u02fc\u02fd\7\u0172\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02fb"+
		"\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\61\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\5\64\33\2\u0304\u030a\7\u0172"+
		"\2\2\u0305\u0306\5\64\33\2\u0306\u0307\7\u0172\2\2\u0307\u0309\3\2\2\2"+
		"\u0308\u0305\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b"+
		"\3\2\2\2\u030b\63\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u0313\5:\36\2\u030e"+
		"\u0313\58\35\2\u030f\u0313\5@!\2\u0310\u0313\5\66\34\2\u0311\u0313\5B"+
		"\"\2\u0312\u030d\3\2\2\2\u0312\u030e\3\2\2\2\u0312\u030f\3\2\2\2\u0312"+
		"\u0310\3\2\2\2\u0312\u0311\3\2\2\2\u0313\65\3\2\2\2\u0314\u0319\5\u01d6"+
		"\u00ec\2\u0315\u0316\7\u015f\2\2\u0316\u0318\5\u01d6\u00ec\2\u0317\u0315"+
		"\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u031e\7\23\2\2\u031d\u031c\3"+
		"\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\5\u0094K\2"+
		"\u0320\u0322\5\u0096L\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0326\3\2\2\2\u0323\u0325\5\u0098M\2\u0324\u0323\3\2\2\2\u0325\u0328"+
		"\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u032a\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0329\u032b\5\u009aN\2\u032a\u0329\3\2\2\2\u032a\u032b"+
		"\3\2\2\2\u032b\u0338\3\2\2\2\u032c\u032d\5\u01d6\u00ec\2\u032d\u032f\7"+
		"\66\2\2\u032e\u0330\7\23\2\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0333\5\u0094K\2\u0332\u0334\5\u0096L\2\u0333\u0332"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\5\u009aN"+
		"\2\u0336\u0338\3\2\2\2\u0337\u0314\3\2\2\2\u0337\u032c\3\2\2\2\u0338\67"+
		"\3\2\2\2\u0339\u033a\5\u01d6\u00ec\2\u033a\u033b\7:\2\2\u033b9\3\2\2\2"+
		"\u033c\u033d\7F\2\2\u033d\u0342\5\u01d6\u00ec\2\u033e\u033f\5\u01d6\u00ec"+
		"\2\u033f\u0340\7F\2\2\u0340\u0342\3\2\2\2\u0341\u033c\3\2\2\2\u0341\u033e"+
		"\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0346\5<\37\2\u0344\u0346\5> \2\u0345"+
		"\u0343\3\2\2\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2"+
		"\2\2\u0347\u034a\t\5\2\2\u0348\u034b\5\u0138\u009d\2\u0349\u034b\5\u019e"+
		"\u00d0\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b;\3\2\2\2\u034c"+
		"\u034d\7\u013f\2\2\u034d\u034f\7\u00ef\2\2\u034e\u0350\7\u00ce\2\2\u034f"+
		"\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u0352\7\u0129"+
		"\2\2\u0352\u0354\t\6\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"=\3\2\2\2\u0355\u0356\7\u0140\2\2\u0356\u0357\7\u00ef\2\2\u0357?\3\2\2"+
		"\2\u0358\u0359\t\7\2\2\u0359\u035a\7\u0084\2\2\u035a\u0360\7x\2\2\u035b"+
		"\u0361\7\u0111\2\2\u035c\u0361\7\u0114\2\2\u035d\u035e\7\u00c6\2\2\u035e"+
		"\u0361\7{\2\2\u035f\u0361\5\u01d6\u00ec\2\u0360\u035b\3\2\2\2\u0360\u035c"+
		"\3\2\2\2\u0360\u035d\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362"+
		"\u0363\5\b\5\2\u0363A\3\2\2\2\u0364\u0366\7\u0080\2\2\u0365\u0364\3\2"+
		"\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\7\u0122\2\2\u0368"+
		"\u0369\7\u0120\2\2\u0369\u036b\5\u01d6\u00ec\2\u036a\u036c\5p9\2\u036b"+
		"\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\5H"+
		"%\2\u036eC\3\2\2\2\u036f\u0370\7@\2\2\u0370\u0374\7\u0120\2\2\u0371\u0372"+
		"\7\u008b\2\2\u0372\u0373\7\u00c6\2\2\u0373\u0375\7o\2\2\u0374\u0371\3"+
		"\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\5\u0168\u00b5"+
		"\2\u0377\u0379\5p9\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a"+
		"\3\2\2\2\u037a\u037b\5H%\2\u037bE\3\2\2\2\u037c\u0383\7@\2\2\u037d\u037e"+
		"\7\u00ab\2\2\u037e\u0384\7\u0122\2\2\u037f\u0381\t\b\2\2\u0380\u037f\3"+
		"\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0384\7\u013b\2\2"+
		"\u0383\u037d\3\2\2\2\u0383\u0380\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386"+
		"\7\u0120\2\2\u0386\u0388\5\u01d6\u00ec\2\u0387\u0389\5p9\2\u0388\u0387"+
		"\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\5H%\2\u038b"+
		"G\3\2\2\2\u038c\u038e\7\23\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2"+
		"\u038e\u038f\3\2\2\2\u038f\u0390\7\u016d\2\2\u0390\u0391\5\u0138\u009d"+
		"\2\u0391\u0392\7\u0170\2\2\u0392\u039c\3\2\2\2\u0393\u0395\7\23\2\2\u0394"+
		"\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u039c\5\u0138"+
		"\u009d\2\u0397\u0398\7\u016d\2\2\u0398\u0399\5J&\2\u0399\u039a\7\u0170"+
		"\2\2\u039a\u039c\3\2\2\2\u039b\u038d\3\2\2\2\u039b\u0394\3\2\2\2\u039b"+
		"\u0397\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u039f\5x=\2\u039e\u039d\3\2\2"+
		"\2\u039e\u039f\3\2\2\2\u039f\u03a1\3\2\2\2\u03a0\u03a2\5v<\2\u03a1\u03a0"+
		"\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2I\3\2\2\2\u03a3\u03a8\5L\'\2\u03a4\u03a5"+
		"\7\u015f\2\2\u03a5\u03a7\5L\'\2\u03a6\u03a4\3\2\2\2\u03a7\u03aa\3\2\2"+
		"\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9K\3\2\2\2\u03aa\u03a8"+
		"\3\2\2\2\u03ab\u03ac\5N(\2\u03ac\u03ae\5\u0094K\2\u03ad\u03af\5\u0096"+
		"L\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b3\3\2\2\2\u03b0"+
		"\u03b2\5\u0098M\2\u03b1\u03b0\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1"+
		"\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b9\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6"+
		"\u03b8\5j\66\2\u03b7\u03b6\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03c2\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc"+
		"\u03bd\7;\2\2\u03bd\u03bf\5\u01d6\u00ec\2\u03be\u03bc\3\2\2\2\u03be\u03bf"+
		"\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\5l\67\2\u03c1\u03ab\3\2\2\2\u03c1"+
		"\u03be\3\2\2\2\u03c2M\3\2\2\2\u03c3\u03c4\5\u01d6\u00ec\2\u03c4O\3\2\2"+
		"\2\u03c5\u03c6\t\t\2\2\u03c6Q\3\2\2\2\u03c7\u03c8\5N(\2\u03c8S\3\2\2\2"+
		"\u03c9\u03ca\5R*\2\u03ca\u03cf\7\u016c\2\2\u03cb\u03ce\5\\/\2\u03cc\u03ce"+
		"\5X-\2\u03cd\u03cb\3\2\2\2\u03cd\u03cc\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf"+
		"\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03cf\3\2"+
		"\2\2\u03d2\u03d3\5V,\2\u03d3\u03d4\7\u016f\2\2\u03d4U\3\2\2\2\u03d5\u03d6"+
		"\3\2\2\2\u03d6W\3\2\2\2\u03d7\u03d8\5P)\2\u03d8\u03d9\5R*\2\u03d9\u03e1"+
		"\7\u016d\2\2\u03da\u03dc\5Z.\2\u03db\u03da\3\2\2\2\u03dc\u03df\3\2\2\2"+
		"\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e2\3\2\2\2\u03df\u03dd"+
		"\3\2\2\2\u03e0\u03e2\7\u0170\2\2\u03e1\u03dd\3\2\2\2\u03e1\u03e0\3\2\2"+
		"\2\u03e2\u03e3\3\2\2\2\u03e3\u03e7\7\u016c\2\2\u03e4\u03e6\5`\61\2\u03e5"+
		"\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2"+
		"\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\5V,\2\u03eb\u03ec"+
		"\7\u016f\2\2\u03ecY\3\2\2\2\u03ed\u03ee\5^\60\2\u03ee\u03ef\5N(\2\u03ef"+
		"\u03f0\7\u0170\2\2\u03f0\u03f7\3\2\2\2\u03f1\u03f2\5^\60\2\u03f2\u03f3"+
		"\5N(\2\u03f3\u03f4\7\u015f\2\2\u03f4\u03f5\5Z.\2\u03f5\u03f7\3\2\2\2\u03f6"+
		"\u03ed\3\2\2\2\u03f6\u03f1\3\2\2\2\u03f7[\3\2\2\2\u03f8\u03f9\5^\60\2"+
		"\u03f9\u03fa\5N(\2\u03fa\u03fb\7\u0172\2\2\u03fb]\3\2\2\2\u03fc\u0404"+
		"\7\u0095\2\2\u03fd\u0404\7w\2\2\u03fe\u0404\7+\2\2\u03ff\u0404\7\u012c"+
		"\2\2\u0400\u0404\7r\2\2\u0401\u0404\7\u011a\2\2\u0402\u0404\5h\65\2\u0403"+
		"\u03fc\3\2\2\2\u0403\u03fd\3\2\2\2\u0403\u03fe\3\2\2\2\u0403\u03ff\3\2"+
		"\2\2\u0403\u0400\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0402\3\2\2\2\u0404"+
		"_\3\2\2\2\u0405\u040a\5\16\b\2\u0406\u040a\5\\/\2\u0407\u040a\5\u00c0"+
		"a\2\u0408\u040a\5b\62\2\u0409\u0405\3\2\2\2\u0409\u0406\3\2\2\2\u0409"+
		"\u0407\3\2\2\2\u0409\u0408\3\2\2\2\u040aa\3\2\2\2\u040b\u040c\7x\2\2\u040c"+
		"\u040d\7\u016d\2\2\u040d\u040e\5\u01da\u00ee\2\u040e\u040f\7\u015e\2\2"+
		"\u040f\u0410\5\u01da\u00ee\2\u0410\u0411\7\u0170\2\2\u0411\u0415\7\u00b3"+
		"\2\2\u0412\u0414\5`\61\2\u0413\u0412\3\2\2\2\u0414\u0417\3\2\2\2\u0415"+
		"\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417\u0415\3\2"+
		"\2\2\u0418\u0419\7g\2\2\u0419\u0438\3\2\2\2\u041a\u041b\7x\2\2\u041b\u041c"+
		"\7\u016d\2\2\u041c\u041d\5f\64\2\u041d\u041e\5N(\2\u041e\u041f\7\u0163"+
		"\2\2\u041f\u0420\5\u01da\u00ee\2\u0420\u0421\7\u0172\2\2\u0421\u0422\5"+
		"N(\2\u0422\u0423\t\n\2\2\u0423\u0424\5\u01da\u00ee\2\u0424\u0425\7\u0172"+
		"\2\2\u0425\u042a\5N(\2\u0426\u0427\7\u015d\2\2\u0427\u042b\7\u015d\2\2"+
		"\u0428\u0429\7\u0173\2\2\u0429\u042b\7\u0173\2\2\u042a\u0426\3\2\2\2\u042a"+
		"\u0428\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\7\u0170\2\2\u042d\u0431"+
		"\7\u016c\2\2\u042e\u0430\5`\61\2\u042f\u042e\3\2\2\2\u0430\u0433\3\2\2"+
		"\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\3\2\2\2\u0433\u0431"+
		"\3\2\2\2\u0434\u0435\7\u016f\2\2\u0435\u0436\5d\63\2\u0436\u0438\3\2\2"+
		"\2\u0437\u040b\3\2\2\2\u0437\u041a\3\2\2\2\u0438c\3\2\2\2\u0439\u043a"+
		"\3\2\2\2\u043ae\3\2\2\2\u043b\u043f\7\u0095\2\2\u043c\u043f\7+\2\2\u043d"+
		"\u043f\5h\65\2\u043e\u043b\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043d\3\2"+
		"\2\2\u043fg\3\2\2\2\u0440\u0441\3\2\2\2\u0441i\3\2\2\2\u0442\u0463\5\u009a"+
		"N\2\u0443\u0445\7\u00c6\2\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u0463\7\u00c8\2\2\u0447\u0448\7\u00de\2\2\u0448\u0463"+
		"\7\u00a3\2\2\u0449\u0463\7\u0130\2\2\u044a\u044b\7\u00e8\2\2\u044b\u044c"+
		"\5\u0168\u00b5\2\u044c\u044d\7\u016d\2\2\u044d\u044e\5\u01d6\u00ec\2\u044e"+
		"\u0452\7\u0170\2\2\u044f\u0451\5n8\2\u0450\u044f\3\2\2\2\u0451\u0454\3"+
		"\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0463\3\2\2\2\u0454"+
		"\u0452\3\2\2\2\u0455\u0456\7\u008a\2\2\u0456\u0457\7\u016d\2\2\u0457\u045c"+
		"\7\u0177\2\2\u0458\u0459\7\u015f\2\2\u0459\u045b\7\u0177\2\2\u045a\u0458"+
		"\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d"+
		"\u045f\3\2\2\2\u045e\u045c\3\2\2\2\u045f\u0463\7\u0170\2\2\u0460\u0463"+
		"\7\27\2\2\u0461\u0463\7f\2\2\u0462\u0442\3\2\2\2\u0462\u0444\3\2\2\2\u0462"+
		"\u0447\3\2\2\2\u0462\u0449\3\2\2\2\u0462\u044a\3\2\2\2\u0462\u0455\3\2"+
		"\2\2\u0462\u0460\3\2\2\2\u0462\u0461\3\2\2\2\u0463k\3\2\2\2\u0464\u0465"+
		"\7\u00de\2\2\u0465\u0467\7\u00a3\2\2\u0466\u0468\7\60\2\2\u0467\u0466"+
		"\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\7\u016d\2"+
		"\2\u046a\u046c\5\u01d6\u00ec\2\u046b\u046d\t\13\2\2\u046c\u046b\3\2\2"+
		"\2\u046c\u046d\3\2\2\2\u046d\u0475\3\2\2\2\u046e\u046f\7\u015f\2\2\u046f"+
		"\u0471\5\u01d6\u00ec\2\u0470\u0472\t\13\2\2\u0471\u0470\3\2\2\2\u0471"+
		"\u0472\3\2\2\2\u0472\u0474\3\2\2\2\u0473\u046e\3\2\2\2\u0474\u0477\3\2"+
		"\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\3\2\2\2\u0477"+
		"\u0475\3\2\2\2\u0478\u047a\7\u0170\2\2\u0479\u047b\7f\2\2\u047a\u0479"+
		"\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047d\3\2\2\2\u047c\u047e\5\u010c\u0087"+
		"\2\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u049e\3\2\2\2\u047f\u0480"+
		"\7y\2\2\u0480\u0481\7\u00a3\2\2\u0481\u0482\7\u016d\2\2\u0482\u0487\5"+
		"\u01d6\u00ec\2\u0483\u0484\7\u015f\2\2\u0484\u0486\5\u01d6\u00ec\2\u0485"+
		"\u0483\3\2\2\2\u0486\u0489\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2"+
		"\2\2\u0488\u048a\3\2\2\2\u0489\u0487\3\2\2\2\u048a\u048b\7\u0170\2\2\u048b"+
		"\u048c\7\u00e8\2\2\u048c\u048d\5\u0168\u00b5\2\u048d\u048e\7\u016d\2\2"+
		"\u048e\u0493\5\u01d6\u00ec\2\u048f\u0490\7\u015f\2\2\u0490\u0492\5\u01d6"+
		"\u00ec\2\u0491\u048f\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0496\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u049a\7\u0170"+
		"\2\2\u0497\u0499\5n8\2\u0498\u0497\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049d"+
		"\u0464\3\2\2\2\u049d\u047f\3\2\2\2\u049em\3\2\2\2\u049f\u04a0\7\u00cd"+
		"\2\2\u04a0\u04a9\t\f\2\2\u04a1\u04a2\7\u00c1\2\2\u04a2\u04aa\7\13\2\2"+
		"\u04a3\u04aa\7\u00ec\2\2\u04a4\u04a5\7\u0105\2\2\u04a5\u04aa\7\u00c8\2"+
		"\2\u04a6\u04a7\7\u0105\2\2\u04a7\u04aa\7P\2\2\u04a8\u04aa\7\'\2\2\u04a9"+
		"\u04a1\3\2\2\2\u04a9\u04a3\3\2\2\2\u04a9\u04a4\3\2\2\2\u04a9\u04a6\3\2"+
		"\2\2\u04a9\u04a8\3\2\2\2\u04aao\3\2\2\2\u04ab\u04ad\5r:\2\u04ac\u04ab"+
		"\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2\2\2\u04af"+
		"q\3\2\2\2\u04b0\u04b1\7\u015f\2\2\u04b1\u04b4\5t;\2\u04b2\u04b4\5\u0082"+
		"B\2\u04b3\u04b0\3\2\2\2\u04b3\u04b2\3\2\2\2\u04b4s\3\2\2\2\u04b5\u04b7"+
		"\7\u00c1\2\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2"+
		"\2\u04b8\u04b9\t\r\2\2\u04b9u\3\2\2\2\u04ba\u04bb\7\u00ac\2\2\u04bb\u04bc"+
		"\5\u019e\u00d0\2\u04bcw\3\2\2\2\u04bd\u04be\5z>\2\u04bey\3\2\2\2\u04bf"+
		"\u04c0\7\u00cd\2\2\u04c0\u04c1\7\67\2\2\u04c1\u04c2\t\16\2\2\u04c2\u04ca"+
		"\7\u00f7\2\2\u04c3\u04ca\5|?\2\u04c4\u04ca\5~@\2\u04c5\u04ca\5\u0080A"+
		"\2\u04c6\u04ca\5\u0082B\2\u04c7\u04ca\5\u0088E\2\u04c8\u04ca\5\u008aF"+
		"\2\u04c9\u04bf\3\2\2\2\u04c9\u04c3\3\2\2\2\u04c9\u04c4\3\2\2\2\u04c9\u04c5"+
		"\3\2\2\2\u04c9\u04c6\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04c8\3\2\2\2\u04ca"+
		"{\3\2\2\2\u04cb\u04cc\7\u0102\2\2\u04cc\u04cd\7A\2\2\u04cd\u04de\t\17"+
		"\2\2\u04ce\u04cf\t\20\2\2\u04cf\u04de\7\u0177\2\2\u04d0\u04de\7\u00c3"+
		"\2\2\u04d1\u04de\t\21\2\2\u04d2\u04d3\7\u0118\2\2\u04d3\u04d6\7\u016d"+
		"\2\2\u04d4\u04d7\5\u01d6\u00ec\2\u04d5\u04d7\7\u0177\2\2\u04d6\u04d4\3"+
		"\2\2\2\u04d6\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8"+
		"\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04de\7\u0170\2\2\u04db\u04dc"+
		"\7\u0121\2\2\u04dc\u04de\5\u01d6\u00ec\2\u04dd\u04cb\3\2\2\2\u04dd\u04ce"+
		"\3\2\2\2\u04dd\u04d0\3\2\2\2\u04dd\u04d1\3\2\2\2\u04dd\u04d2\3\2\2\2\u04dd"+
		"\u04db\3\2\2\2\u04de}\3\2\2\2\u04df\u04e1\7\u0090\2\2\u04e0\u04df\3\2"+
		"\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\7\u008e\2\2\u04e3"+
		"\u0501\5\u01d6\u00ec\2\u04e4\u04e5\7\u013f\2\2\u04e5\u0501\7\u00ea\2\2"+
		"\u04e6\u04e7\7^\2\2\u04e7\u04e8\7#\2\2\u04e8\u04e9\7\u0085\2\2\u04e9\u04ea"+
		"\7\u016d\2\2\u04ea\u04ef\5\u01d6\u00ec\2\u04eb\u04ec\7\u015f\2\2\u04ec"+
		"\u04ee\5\u01d6\u00ec\2\u04ed\u04eb\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed"+
		"\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f2"+
		"\u04f3\7\u0170\2\2\u04f3\u0501\3\2\2\2\u04f4\u04f6\7\u00c6\2\2\u04f5\u04f4"+
		"\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u0501\7\u00b1\2"+
		"\2\u04f8\u04f9\78\2\2\u04f9\u0501\t\22\2\2\u04fa\u04fb\7T\2\2\u04fb\u0501"+
		"\7\u00ce\2\2\u04fc\u04fd\7\u013f\2\2\u04fd\u04fe\7\u00ec\2\2\u04fe\u04ff"+
		"\7\u00cd\2\2\u04ff\u0501\7a\2\2\u0500\u04e0\3\2\2\2\u0500\u04e4\3\2\2"+
		"\2\u0500\u04e6\3\2\2\2\u0500\u04f5\3\2\2\2\u0500\u04f8\3\2\2\2\u0500\u04fa"+
		"\3\2\2\2\u0500\u04fc\3\2\2\2\u0501\177\3\2\2\2\u0502\u0504\7\u0130\2\2"+
		"\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506"+
		"\7\u00de\2\2\u0506\u0507\7\u0090\2\2\u0507\u0508\7\u016d\2\2\u0508\u050d"+
		"\5\u01d6\u00ec\2\u0509\u050a\7\u015f\2\2\u050a\u050c\5\u01d6\u00ec\2\u050b"+
		"\u0509\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2"+
		"\2\2\u050e\u0510\3\2\2\2\u050f\u050d\3\2\2\2\u0510\u0511\7\u0170\2\2\u0511"+
		"\u0515\3\2\2\2\u0512\u0513\7\u013f\2\2\u0513\u0515\7H\2\2\u0514\u0503"+
		"\3\2\2\2\u0514\u0512\3\2\2\2\u0515\u0081\3\2\2\2\u0516\u0517\5\u0084C"+
		"\2\u0517\u0083\3\2\2\2\u0518\u0519\7\u00f6\2\2\u0519\u051a\7z\2\2\u051a"+
		"\u051b\7V\2\2\u051b\u051c\5\u0086D\2\u051c\u0085\3\2\2\2\u051d\u051e\7"+
		"t\2\2\u051e\u051f\7\u0123\2\2\u051f\u0520\7#\2\2\u0520\u0534\5\u019e\u00d0"+
		"\2\u0521\u0522\7\63\2\2\u0522\u0523\7\u00a0\2\2\u0523\u0524\7\u0123\2"+
		"\2\u0524\u0525\7#\2\2\u0525\u0534\5\u019e\u00d0\2\u0526\u0527\7\u00b4"+
		"\2\2\u0527\u0528\7\u00a4\2\2\u0528\u0529\7\u0123\2\2\u0529\u052a\7#\2"+
		"\2\u052a\u0534\5\u019e\u00d0\2\u052b\u052c\7\u00aa\2\2\u052c\u052d\7\u0123"+
		"\2\2\u052d\u052e\7#\2\2\u052e\u0534\5\u019e\u00d0\2\u052f\u0530\7\u00c8"+
		"\2\2\u0530\u0531\7R\2\2\u0531\u0532\7\23\2\2\u0532\u0534\5\u019e\u00d0"+
		"\2\u0533\u051d\3\2\2\2\u0533\u0521\3\2\2\2\u0533\u0526\3\2\2\2\u0533\u052b"+
		"\3\2\2\2\u0533\u052f\3\2\2\2\u0534\u0087\3\2\2\2\u0535\u0536\7\u00cd\2"+
		"\2\u0536\u053a\5\u01d6\u00ec\2\u0537\u0538\7\u0124\2\2\u0538\u053a\5\u01d6"+
		"\u00ec\2\u0539\u0535\3\2\2\2\u0539\u0537\3\2\2\2\u053a\u0089\3\2\2\2\u053b"+
		"\u053d\7\27\2\2\u053c\u053e\7\u0163\2\2\u053d\u053c\3\2\2\2\u053d\u053e"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0557\5\u019e\u00d0\2\u0540\u0542\7"+
		"\65\2\2\u0541\u0543\7\u0163\2\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2"+
		"\2\u0543\u0544\3\2\2\2\u0544\u0557\5\u019e\u00d0\2\u0545\u0547\7P\2\2"+
		"\u0546\u0545\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u054b\3\2\2\2\u0548\u0549"+
		"\7,\2\2\u0549\u054c\7\u0105\2\2\u054a\u054c\7-\2\2\u054b\u0548\3\2\2\2"+
		"\u054b\u054a\3\2\2\2\u054c\u054e\3\2\2\2\u054d\u054f\7\u0163\2\2\u054e"+
		"\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0557\5\u019e"+
		"\u00d0\2\u0551\u0553\7h\2\2\u0552\u0554\7\u0163\2\2\u0553\u0552\3\2\2"+
		"\2\u0553\u0554\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0557\5\u019e\u00d0\2"+
		"\u0556\u053b\3\2\2\2\u0556\u0540\3\2\2\2\u0556\u0546\3\2\2\2\u0556\u0551"+
		"\3\2\2\2\u0557\u008b\3\2\2\2\u0558\u0559\7\17\2\2\u0559\u055a\7\u0120"+
		"\2\2\u055a\u055b\5\u0168\u00b5\2\u055b\u055c\5\u008eH\2\u055c\u008d\3"+
		"\2\2\2\u055d\u055e\5\u0090I\2\u055e\u008f\3\2\2\2\u055f\u0562\7\f\2\2"+
		"\u0560\u0561\7;\2\2\u0561\u0563\5\u01d6\u00ec\2\u0562\u0560\3\2\2\2\u0562"+
		"\u0563\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565\5\u0092J\2\u0565\u0091"+
		"\3\2\2\2\u0566\u0567\7\u00de\2\2\u0567\u0569\7\u00a3\2\2\u0568\u056a\7"+
		"\60\2\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u056c\7\u016d\2\2\u056c\u056e\5\u01d6\u00ec\2\u056d\u056f\t\13\2\2\u056e"+
		"\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0577\3\2\2\2\u0570\u0571\7\u015f"+
		"\2\2\u0571\u0573\5\u01d6\u00ec\2\u0572\u0574\t\13\2\2\u0573\u0572\3\2"+
		"\2\2\u0573\u0574\3\2\2\2\u0574\u0576\3\2\2\2\u0575\u0570\3\2\2\2\u0576"+
		"\u0579\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057a\3\2"+
		"\2\2\u0579\u0577\3\2\2\2\u057a\u057c\7\u0170\2\2\u057b\u057d\7f\2\2\u057c"+
		"\u057b\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u0580\5\u010c"+
		"\u0087\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u05a5\3\2\2\2\u0581"+
		"\u0582\7y\2\2\u0582\u0583\7\u00a3\2\2\u0583\u0584\7\u016d\2\2\u0584\u0589"+
		"\5\u01d6\u00ec\2\u0585\u0586\7\u015f\2\2\u0586\u0588\5\u01d6\u00ec\2\u0587"+
		"\u0585\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u058a\3\2"+
		"\2\2\u058a\u058c\3\2\2\2\u058b\u0589\3\2\2\2\u058c\u058d\7\u0170\2\2\u058d"+
		"\u058e\7\u00e8\2\2\u058e\u058f\5\u0168\u00b5\2\u058f\u0590\7\u016d\2\2"+
		"\u0590\u0595\5\u01d6\u00ec\2\u0591\u0592\7\u015f\2\2\u0592\u0594\5\u01d6"+
		"\u00ec\2\u0593\u0591\3\2\2\2\u0594\u0597\3\2\2\2\u0595\u0593\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u0598\3\2\2\2\u0597\u0595\3\2\2\2\u0598\u059c\7\u0170"+
		"\2\2\u0599\u059b\5n8\2\u059a\u0599\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a"+
		"\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u05a5\3\2\2\2\u059e\u059c\3\2\2\2\u059f"+
		"\u05a0\7P\2\2\u05a0\u05a1\5\u019e\u00d0\2\u05a1\u05a2\7x\2\2\u05a2\u05a3"+
		"\5\u01d6\u00ec\2\u05a3\u05a5\3\2\2\2\u05a4\u0566\3\2\2\2\u05a4\u0581\3"+
		"\2\2\2\u05a4\u059f\3\2\2\2\u05a5\u0093\3\2\2\2\u05a6\u05d4\7+\2\2\u05a7"+
		"\u05d4\7\34\2\2\u05a8\u05d4\7\35\2\2\u05a9\u05d4\7\36\2\2\u05aa\u05d4"+
		"\7\37\2\2\u05ab\u05d4\7 \2\2\u05ac\u05d4\7I\2\2\u05ad\u05d4\7J\2\2\u05ae"+
		"\u05d4\7M\2\2\u05af\u05d4\7N\2\2\u05b0\u05b2\7`\2\2\u05b1\u05b3\7\u00dc"+
		"\2\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05d4\3\2\2\2\u05b4"+
		"\u05d4\7w\2\2\u05b5\u05d4\7\u0095\2\2\u05b6\u05d4\7\u0096\2\2\u05b7\u05d4"+
		"\7\u0097\2\2\u05b8\u05d4\7\u0098\2\2\u05b9\u05d4\7\u0099\2\2\u05ba\u05d4"+
		"\7\u00be\2\2\u05bb\u05d4\7\u00c0\2\2\u05bc\u05d4\7\u00ca\2\2\u05bd\u05d4"+
		"\7\u00c9\2\2\u05be\u05d4\7\u00db\2\2\u05bf\u05d4\7\u00e7\2\2\u05c0\u05c1"+
		"\7\u00ee\2\2\u05c1\u05d4\7\u013a\2\2\u05c2\u05d4\7\u010c\2\2\u05c3\u05d4"+
		"\7\u010b\2\2\u05c4\u05d4\7\u010d\2\2\u05c5\u05d4\7\u010f\2\2\u05c6\u05d4"+
		"\7\u010e\2\2\u05c7\u05d4\7\u011a\2\2\u05c8\u05d4\7\u011f\2\2\u05c9\u05d4"+
		"\7\u0126\2\2\u05ca\u05d4\7\u0127\2\2\u05cb\u05d4\7\u0138\2\2\u05cc\u05d4"+
		"\7\u0139\2\2\u05cd\u05d4\7\u0143\2\2\u05ce\u05d1\5\u01d6\u00ec\2\u05cf"+
		"\u05d0\7\5\2\2\u05d0\u05d2\t\23\2\2\u05d1\u05cf\3\2\2\2\u05d1\u05d2\3"+
		"\2\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05a6\3\2\2\2\u05d3\u05a7\3\2\2\2\u05d3"+
		"\u05a8\3\2\2\2\u05d3\u05a9\3\2\2\2\u05d3\u05aa\3\2\2\2\u05d3\u05ab\3\2"+
		"\2\2\u05d3\u05ac\3\2\2\2\u05d3\u05ad\3\2\2\2\u05d3\u05ae\3\2\2\2\u05d3"+
		"\u05af\3\2\2\2\u05d3\u05b0\3\2\2\2\u05d3\u05b4\3\2\2\2\u05d3\u05b5\3\2"+
		"\2\2\u05d3\u05b6\3\2\2\2\u05d3\u05b7\3\2\2\2\u05d3\u05b8\3\2\2\2\u05d3"+
		"\u05b9\3\2\2\2\u05d3\u05ba\3\2\2\2\u05d3\u05bb\3\2\2\2\u05d3\u05bc\3\2"+
		"\2\2\u05d3\u05bd\3\2\2\2\u05d3\u05be\3\2\2\2\u05d3\u05bf\3\2\2\2\u05d3"+
		"\u05c0\3\2\2\2\u05d3\u05c2\3\2\2\2\u05d3\u05c3\3\2\2\2\u05d3\u05c4\3\2"+
		"\2\2\u05d3\u05c5\3\2\2\2\u05d3\u05c6\3\2\2\2\u05d3\u05c7\3\2\2\2\u05d3"+
		"\u05c8\3\2\2\2\u05d3\u05c9\3\2\2\2\u05d3\u05ca\3\2\2\2\u05d3\u05cb\3\2"+
		"\2\2\u05d3\u05cc\3\2\2\2\u05d3\u05cd\3\2\2\2\u05d3\u05ce\3\2\2\2\u05d4"+
		"\u0095\3\2\2\2\u05d5\u05d6\7\u016d\2\2\u05d6\u05d8\t\24\2\2\u05d7\u05d9"+
		"\t\25\2\2\u05d8\u05d7\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05dc\3\2\2\2"+
		"\u05da\u05db\7\u015f\2\2\u05db\u05dd\7\u0177\2\2\u05dc\u05da\3\2\2\2\u05dc"+
		"\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\7\u0170\2\2\u05df\u0097"+
		"\3\2\2\2\u05e0\u05e2\7\u00c6\2\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2\2"+
		"\2\u05e2\u05e3\3\2\2\2\u05e3\u05ec\7\u00c8\2\2\u05e4\u05e5\7,\2\2\u05e5"+
		"\u05e6\7\u0105\2\2\u05e6\u05ec\5\u01d6\u00ec\2\u05e7\u05e9\7\u00c6\2\2"+
		"\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec"+
		"\t\26\2\2\u05eb\u05e1\3\2\2\2\u05eb\u05e4\3\2\2\2\u05eb\u05e8\3\2\2\2"+
		"\u05ec\u0099\3\2\2\2\u05ed\u05ef\7\u015e\2\2\u05ee\u05ed\3\2\2\2\u05ee"+
		"\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\7\u0163\2\2\u05f1\u05fa"+
		"\5\u019e\u00d0\2\u05f2\u05f4\7\u013f\2\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4"+
		"\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f7\7P\2\2\u05f6\u05f8\5\u019e\u00d0"+
		"\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\3\2\2\2\u05f9\u05ee"+
		"\3\2\2\2\u05f9\u05f3\3\2\2\2\u05fa\u009b\3\2\2\2\u05fb\u05fc\7@\2\2\u05fc"+
		"\u0600\t\27\2\2\u05fd\u05fe\7\u008b\2\2\u05fe\u05ff\7\u00c6\2\2\u05ff"+
		"\u0601\7o\2\2\u0600\u05fd\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2"+
		"\2\2\u0602\u0606\5\u019e\u00d0\2\u0603\u0605\5\u009eP\2\u0604\u0603\3"+
		"\2\2\2\u0605\u0608\3\2\2\2\u0606\u0604\3\2\2\2\u0606\u0607\3\2\2\2\u0607"+
		"\u009d\3\2\2\2\u0608\u0606\3\2\2\2\u0609\u060a\7\65\2\2\u060a\u060e\5"+
		"\u019e\u00d0\2\u060b\u060c\7\u00ac\2\2\u060c\u060e\5\u019e\u00d0\2\u060d"+
		"\u0609\3\2\2\2\u060d\u060b\3\2\2\2\u060e\u009f\3\2\2\2\u060f\u0617\7\17"+
		"\2\2\u0610\u0613\7@\2\2\u0611\u0612\7\u00d0\2\2\u0612\u0614\7\u00ea\2"+
		"\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0617\3\2\2\2\u0615\u0617"+
		"\7\u00ea\2\2\u0616\u060f\3\2\2\2\u0616\u0610\3\2\2\2\u0616\u0615\3\2\2"+
		"\2\u0616\u0617\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\7~\2\2\u0619\u061b"+
		"\5\u01d6\u00ec\2\u061a\u061c\5\u00b2Z\2\u061b\u061a\3\2\2\2\u061b\u061c"+
		"\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061f\5\u00a2R\2\u061e\u0620\t\30\2"+
		"\2\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0622\3\2\2\2\u0621\u0623"+
		"\5\62\32\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624\3\2\2\2"+
		"\u0624\u0625\5\b\5\2\u0625\u00a1\3\2\2\2\u0626\u0627\t\31\2\2\u0627\u0629"+
		"\5\u0094K\2\u0628\u062a\5\u0096L\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2"+
		"\2\2\u062a\u00a3\3\2\2\2\u062b\u0633\7\17\2\2\u062c\u062f\7@\2\2\u062d"+
		"\u062e\7\u00d0\2\2\u062e\u0630\7\u00ea\2\2\u062f\u062d\3\2\2\2\u062f\u0630"+
		"\3\2\2\2\u0630\u0633\3\2\2\2\u0631\u0633\7\u00ea\2\2\u0632\u062b\3\2\2"+
		"\2\u0632\u062c\3\2\2\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0634"+
		"\3\2\2\2\u0634\u0635\7\u00d7\2\2\u0635\u0636\5\u01d6\u00ec\2\u0636\u0637"+
		"\t\30\2\2\u0637\u0638\5\u00a6T\2\u0638\u063c\7g\2\2\u0639\u063a\5\u01d6"+
		"\u00ec\2\u063a\u063b\7\u0172\2\2\u063b\u063d\3\2\2\2\u063c\u0639\3\2\2"+
		"\2\u063c\u063d\3\2\2\2\u063d\u00a5\3\2\2\2\u063e\u063f\5\u00a8U\2\u063f"+
		"\u0645\7\u0172\2\2\u0640\u0641\5\u00a8U\2\u0641\u0642\7\u0172\2\2\u0642"+
		"\u0644\3\2\2\2\u0643\u0640\3\2\2\2\u0644\u0647\3\2\2\2\u0645\u0643\3\2"+
		"\2\2\u0645\u0646\3\2\2\2\u0646\u00a7\3\2\2\2\u0647\u0645\3\2\2\2\u0648"+
		"\u0656\5\64\33\2\u0649\u064a\7~\2\2\u064a\u064c\5\u01d6\u00ec\2\u064b"+
		"\u064d\5\u00b2Z\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e"+
		"\3\2\2\2\u064e\u064f\5\u00a2R\2\u064f\u0656\3\2\2\2\u0650\u0651\t\32\2"+
		"\2\u0651\u0653\5\u01d6\u00ec\2\u0652\u0654\5\u00b2Z\2\u0653\u0652\3\2"+
		"\2\2\u0653\u0654\3\2\2\2\u0654\u0656\3\2\2\2\u0655\u0648\3\2\2\2\u0655"+
		"\u0649\3\2\2\2\u0655\u0650\3\2\2\2\u0656\u00a9\3\2\2\2\u0657\u065f\7\17"+
		"\2\2\u0658\u065b\7@\2\2\u0659\u065a\7\u00d0\2\2\u065a\u065c\7\u00ea\2"+
		"\2\u065b\u0659\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065f\3\2\2\2\u065d\u065f"+
		"\7\u00ea\2\2\u065e\u0657\3\2\2\2\u065e\u0658\3\2\2\2\u065e\u065d\3\2\2"+
		"\2\u065e\u065f\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0661\7\u00d7\2\2\u0661"+
		"\u0662\7!\2\2\u0662\u0663\5\u01d6\u00ec\2\u0663\u0664\t\30\2\2\u0664\u0665"+
		"\5\u00acW\2\u0665\u0669\7g\2\2\u0666\u0667\5\u01d6\u00ec\2\u0667\u0668"+
		"\7\u0172\2\2\u0668\u066a\3\2\2\2\u0669\u0666\3\2\2\2\u0669\u066a\3\2\2"+
		"\2\u066a\u00ab\3\2\2\2\u066b\u066c\5\u00aeX\2\u066c\u0672\7\u0172\2\2"+
		"\u066d\u066e\5\u00aeX\2\u066e\u066f\7\u0172\2\2\u066f\u0671\3\2\2\2\u0670"+
		"\u066d\3\2\2\2\u0671\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0672\u0673\3\2"+
		"\2\2\u0673\u00ad\3\2\2\2\u0674\u0672\3\2\2\2\u0675\u0679\5\64\33\2\u0676"+
		"\u0679\5\u00a0Q\2\u0677\u0679\5\u00b0Y\2\u0678\u0675\3\2\2\2\u0678\u0676"+
		"\3\2\2\2\u0678\u0677\3\2\2\2\u0679\u00af\3\2\2\2\u067a\u0682\7\17\2\2"+
		"\u067b\u067e\7@\2\2\u067c\u067d\7\u00d0\2\2\u067d\u067f\7\u00ea\2\2\u067e"+
		"\u067c\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0682\3\2\2\2\u0680\u0682\7\u00ea"+
		"\2\2\u0681\u067a\3\2\2\2\u0681\u067b\3\2\2\2\u0681\u0680\3\2\2\2\u0681"+
		"\u0682\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\t\32\2\2\u0684\u0686\5"+
		"\u01d6\u00ec\2\u0685\u0687\5\u00b2Z\2\u0686\u0685\3\2\2\2\u0686\u0687"+
		"\3\2\2\2\u0687\u0689\3\2\2\2\u0688\u068a\5\u00b6\\\2\u0689\u0688\3\2\2"+
		"\2\u0689\u068a\3\2\2\2\u068a\u068c\3\2\2\2\u068b\u068d\t\30\2\2\u068c"+
		"\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068f\3\2\2\2\u068e\u0690\5\62"+
		"\32\2\u068f\u068e\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0692\3\2\2\2\u0691"+
		"\u0693\5\u0134\u009b\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694"+
		"\3\2\2\2\u0694\u0698\5\f\7\2\u0695\u0696\5\u01d6\u00ec\2\u0696\u0697\7"+
		"\u0172\2\2\u0697\u0699\3\2\2\2\u0698\u0695\3\2\2\2\u0698\u0699\3\2\2\2"+
		"\u0699\u00b1\3\2\2\2\u069a\u069b\7\u016d\2\2\u069b\u06b1\7\u0170\2\2\u069c"+
		"\u069d\7\u016d\2\2\u069d\u06a2\5\u00b4[\2\u069e\u069f\7\u015f\2\2\u069f"+
		"\u06a1\5\u00b4[\2\u06a0\u069e\3\2\2\2\u06a1\u06a4\3\2\2\2\u06a2\u06a0"+
		"\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a5"+
		"\u06a6\7\u0170\2\2\u06a6\u06b1\3\2\2\2\u06a7\u06a8\6Z\4\2\u06a8\u06ad"+
		"\5\u00b4[\2\u06a9\u06aa\7\u015f\2\2\u06aa\u06ac\5\u00b4[\2\u06ab\u06a9"+
		"\3\2\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae"+
		"\u06b1\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u069a\3\2\2\2\u06b0\u069c\3\2"+
		"\2\2\u06b0\u06a7\3\2\2\2\u06b1\u00b3\3\2\2\2\u06b2\u06b8\7\u008e\2\2\u06b3"+
		"\u06b8\7\u00d2\2\2\u06b4\u06b8\7\u0093\2\2\u06b5\u06b6\7\u008e\2\2\u06b6"+
		"\u06b8\7\u00d2\2\2\u06b7\u06b2\3\2\2\2\u06b7\u06b3\3\2\2\2\u06b7\u06b4"+
		"\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9"+
		"\u06ba\5\u01d6\u00ec\2\u06ba\u06bc\5\u0094K\2\u06bb\u06bd\5\u0096L\2\u06bc"+
		"\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06c1\3\2\2\2\u06be\u06c0\5\u0098"+
		"M\2\u06bf\u06be\3\2\2\2\u06c0\u06c3\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c1"+
		"\u06c2\3\2\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c4\u06c6\5\u009a"+
		"N\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06dd\3\2\2\2\u06c7"+
		"\u06cd\5\u01d6\u00ec\2\u06c8\u06ce\7\u008e\2\2\u06c9\u06ce\7\u00d2\2\2"+
		"\u06ca\u06ce\7\u0093\2\2\u06cb\u06cc\7\u008e\2\2\u06cc\u06ce\7\u00d2\2"+
		"\2\u06cd\u06c8\3\2\2\2\u06cd\u06c9\3\2\2\2\u06cd\u06ca\3\2\2\2\u06cd\u06cb"+
		"\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d1\5\u0094K"+
		"\2\u06d0\u06d2\5\u0096L\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2"+
		"\u06d6\3\2\2\2\u06d3\u06d5\5\u0098M\2\u06d4\u06d3\3\2\2\2\u06d5\u06d8"+
		"\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06da\3\2\2\2\u06d8"+
		"\u06d6\3\2\2\2\u06d9\u06db\5\u009aN\2\u06da\u06d9\3\2\2\2\u06da\u06db"+
		"\3\2\2\2\u06db\u06dd\3\2\2\2\u06dc\u06b7\3\2\2\2\u06dc\u06c7\3\2\2\2\u06dd"+
		"\u00b5\3\2\2\2\u06de\u06e0\5\u00b8]\2\u06df\u06de\3\2\2\2\u06e0\u06e1"+
		"\3\2\2\2\u06e1\u06df\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u00b7\3\2\2\2\u06e3"+
		"\u06e4\7\u00a5\2\2\u06e4\u06ef\7\u0110\2\2\u06e5\u06e6\7\u0110\2\2\u06e6"+
		"\u06e7\7\u0101\2\2\u06e7\u06ef\t\33\2\2\u06e8\u06ea\7b\2\2\u06e9\u06e8"+
		"\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\7\u00ed\2"+
		"\2\u06ec\u06ed\7\u0108\2\2\u06ed\u06ef\7\u0177\2\2\u06ee\u06e3\3\2\2\2"+
		"\u06ee\u06e5\3\2\2\2\u06ee\u06e9\3\2\2\2\u06ef\u00b9\3\2\2\2\u06f0\u06f1"+
		"\7a\2\2\u06f1\u06f4\7\u0120\2\2\u06f2\u06f3\7\u008b\2\2\u06f3\u06f5\7"+
		"o\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6"+
		"\u06ff\5\u0168\u00b5\2\u06f7\u06f8\7a\2\2\u06f8\u06fb\t\27\2\2\u06f9\u06fa"+
		"\7\u008b\2\2\u06fa\u06fc\7o\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fc\3\2\2"+
		"\2\u06fc\u06fd\3\2\2\2\u06fd\u06ff\5\u019e\u00d0\2\u06fe\u06f0\3\2\2\2"+
		"\u06fe\u06f7\3\2\2\2\u06ff\u00bb\3\2\2\2\u0700\u0701\7g\2\2\u0701\u0702"+
		"\7\u012b\2\2\u0702\u00bd\3\2\2\2\u0703\u0705\t\34\2\2\u0704\u0706\7\u008d"+
		"\2\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0707\3\2\2\2\u0707"+
		"\u070d\5\u019e\u00d0\2\u0708\u0709\7\u016d\2\2\u0709\u070a\5\u01be\u00e0"+
		"\2\u070a\u070b\7\u0170\2\2\u070b\u070e\3\2\2\2\u070c\u070e\5\u01be\u00e0"+
		"\2\u070d\u0708\3\2\2\2\u070d\u070c\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0718"+
		"\3\2\2\2\u070f\u0710\7\u009c\2\2\u0710\u0715\7\u0174\2\2\u0711\u0712\7"+
		"\u015f\2\2\u0712\u0714\7\u0174\2\2\u0713\u0711\3\2\2\2\u0714\u0717\3\2"+
		"\2\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0719\3\2\2\2\u0717"+
		"\u0715\3\2\2\2\u0718\u070f\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071b\3\2"+
		"\2\2\u071a\u071c\5\u0136\u009c\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2\2"+
		"\2\u071c\u00bf\3\2\2\2\u071d\u0721\5\u00c2b\2\u071e\u0721\5\u00c6d\2\u071f"+
		"\u0721\5\u00c8e\2\u0720\u071d\3\2\2\2\u0720\u071e\3\2\2\2\u0720\u071f"+
		"\3\2\2\2\u0721\u00c1\3\2\2\2\u0722\u0723\7\u008b\2\2\u0723\u0724\5\u018e"+
		"\u00c8\2\u0724\u0725\7\u0125\2\2\u0725\u0726\7\u016c\2\2\u0726\u0727\5"+
		"\4\3\2\u0727\u0728\7\u016f\2\2\u0728\u072c\5\u00c4c\2\u0729\u072b\5\u00ca"+
		"f\2\u072a\u0729\3\2\2\2\u072b\u072e\3\2\2\2\u072c\u072a\3\2\2\2\u072c"+
		"\u072d\3\2\2\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072f\u0731\5\u00cc"+
		"g\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\3\2\2\2\u0732"+
		"\u0733\7g\2\2\u0733\u0734\7\u008b\2\2\u0734\u00c3\3\2\2\2\u0735\u0736"+
		"\3\2\2\2\u0736\u00c5\3\2\2\2\u0737\u0738\7\u008b\2\2\u0738\u0739\5\u018e"+
		"\u00c8\2\u0739\u073c\5\b\5\2\u073a\u073b\7c\2\2\u073b\u073d\5\b\5\2\u073c"+
		"\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u00c7\3\2\2\2\u073e\u073f\7\6"+
		"\2\2\u073f\u0740\7\u008b\2\2\u0740\u0741\5\u018e\u00c8\2\u0741\u0742\7"+
		"\u0125\2\2\u0742\u0743\5\b\5\2\u0743\u00c9\3\2\2\2\u0744\u0745\t\35\2"+
		"\2\u0745\u0746\5\u018e\u00c8\2\u0746\u0747\7\u0125\2\2\u0747\u0748\5\4"+
		"\3\2\u0748\u00cb\3\2\2\2\u0749\u074a\7c\2\2\u074a\u074b\5\4\3\2\u074b"+
		"\u00cd\3\2\2\2\u074c\u074f\7\u008f\2\2\u074d\u0750\5\u01d0\u00e9\2\u074e"+
		"\u0750\5\u019e\u00d0\2\u074f\u074d\3\2\2\2\u074f\u074e\3\2\2\2\u0750\u00cf"+
		"\3\2\2\2\u0751\u0758\7\u0094\2\2\u0752\u0753\7\u00d5\2\2\u0753\u0759\7"+
		"\u0120\2\2\u0754\u0756\7\u009c\2\2\u0755\u0757\7\u0120\2\2\u0756\u0755"+
		"\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0759\3\2\2\2\u0758\u0752\3\2\2\2\u0758"+
		"\u0754\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u075c\5\u0168\u00b5\2\u075b\u075d"+
		"\5\u00d2j\2\u075c\u075b\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0760\3\2\2"+
		"\2\u075e\u0761\5\u0138\u009d\2\u075f\u0761\5\u00d4k\2\u0760\u075e\3\2"+
		"\2\2\u0760\u075f\3\2\2\2\u0761\u00d1\3\2\2\2\u0762\u0763\7\u016d\2\2\u0763"+
		"\u0768\5\u01d6\u00ec\2\u0764\u0765\7\u015f\2\2\u0765\u0767\5\u01d6\u00ec"+
		"\2\u0766\u0764\3\2\2\2\u0767\u076a\3\2\2\2\u0768\u0766\3\2\2\2\u0768\u0769"+
		"\3\2\2\2\u0769\u076b\3\2\2\2\u076a\u0768\3\2\2\2\u076b\u076c\7\u0170\2"+
		"\2\u076c\u00d3\3\2\2\2\u076d\u076e\7\u0136\2\2\u076e\u0773\5\u00d6l\2"+
		"\u076f\u0770\7\u015f\2\2\u0770\u0772\5\u00d6l\2\u0771\u076f\3\2\2\2\u0772"+
		"\u0775\3\2\2\2\u0773\u0771\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u00d5\3\2"+
		"\2\2\u0775\u0773\3\2\2\2\u0776\u0777\7\u016d\2\2\u0777\u077c\5\u019e\u00d0"+
		"\2\u0778\u0779\7\u015f\2\2\u0779\u077b\5\u019e\u00d0\2\u077a\u0778\3\2"+
		"\2\2\u077b\u077e\3\2\2\2\u077c\u077a\3\2\2\2\u077c\u077d\3\2\2\2\u077d"+
		"\u077f\3\2\2\2\u077e\u077c\3\2\2\2\u077f\u0780\7\u0170\2\2\u0780\u00d7"+
		"\3\2\2\2\u0781\u0782\7\u0094\2\2\u0782\u0784\7\u00d5\2\2\u0783\u0785\7"+
		"\u00ab\2\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0786\3\2\2\2"+
		"\u0786\u0787\7\\\2\2\u0787\u0788\5\u01c4\u00e3\2\u0788\u0789\5\u01c2\u00e2"+
		"\2\u0789\u00d9\3\2\2\2\u078a\u078c\7p\2\2\u078b\u078d\7\u0174\2\2\u078c"+
		"\u078b\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u0790\3\2\2\2\u078e\u078f\7\u013c"+
		"\2\2\u078f\u0791\5\u018e\u00c8\2\u0790\u078e\3\2\2\2\u0790\u0791\3\2\2"+
		"\2\u0791\u00db\3\2\2\2\u0792\u0793\7\177\2\2\u0793\u0794\7Z\2\2\u0794"+
		"\u0795\5\u00dep\2\u0795\u00dd\3\2\2\2\u0796\u0799\5\u00e0q\2\u0797\u0799"+
		"\5\u00e2r\2\u0798\u0796\3\2\2\2\u0798\u0797\3\2\2\2\u0799\u00df\3\2\2"+
		"\2\u079a\u079b\7m\2\2\u079b\u079c\7\u0177\2\2\u079c\u079d\5\u01d6\u00ec"+
		"\2\u079d\u079e\7\u0163\2\2\u079e\u079f\7\u00b9\2\2\u079f\u00e1\3\2\2\2"+
		"\u07a0\u07a1\5\u01d6\u00ec\2\u07a1\u07a2\7\u0163\2\2\u07a2\u07a3\7\u00f9"+
		"\2\2\u07a3\u00e3\3\2\2\2\u07a4\u07a5\7\u0082\2\2\u07a5\u07aa\5\u00e6t"+
		"\2\u07a6\u07a7\7\u015f\2\2\u07a7\u07a9\5\u00e6t\2\u07a8\u07a6\3\2\2\2"+
		"\u07a9\u07ac\3\2\2\2\u07aa\u07a8\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ad"+
		"\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ad\u07ae\7\u0129\2\2\u07ae\u07af\7\u00f4"+
		"\2\2\u07af\u07b0\5\u01d6\u00ec\2\u07b0\u00e5\3\2\2\2\u07b1\u07b2\7l\2"+
		"\2\u07b2\u07b3\7\u00cd\2\2\u07b3\u07b4\7\u00e1\2\2\u07b4\u07b5\5\u01d6"+
		"\u00ec\2\u07b5\u00e7\3\2\2\2\u07b6\u07b8\7\u00a6\2\2\u07b7\u07b9\7\u0174"+
		"\2\2\u07b8\u07b7\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u00e9\3\2\2\2\u07ba"+
		"\u07bb\7\u00b4\2\2\u07bb\u07bc\7\u00cb\2\2\u07bc\u07bf\5\u019e\u00d0\2"+
		"\u07bd\u07be\7\u0129\2\2\u07be\u07c0\5\u019e\u00d0\2\u07bf\u07bd\3\2\2"+
		"\2\u07bf\u07c0\3\2\2\2\u07c0\u07c3\3\2\2\2\u07c1\u07c2\7\26\2\2\u07c2"+
		"\u07c4\5\u019e\u00d0\2\u07c3\u07c1\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u00eb"+
		"\3\2\2\2\u07c5\u07c6\7\u00cf\2\2\u07c6\u07cc\7\u0174\2\2\u07c7\u07ca\7"+
		"x\2\2\u07c8\u07cb\5\u0138\u009d\2\u07c9\u07cb\5\u019e\u00d0\2\u07ca\u07c8"+
		"\3\2\2\2\u07ca\u07c9\3\2\2\2\u07cb\u07cd\3\2\2\2\u07cc\u07c7\3\2\2\2\u07cc"+
		"\u07cd\3\2\2\2\u07cd\u00ed\3\2\2\2\u07ce\u07d0\7s\2\2\u07cf\u07d1\7|\2"+
		"\2\u07d0\u07cf\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3"+
		"\7\u0174\2\2\u07d3\u07d4\7\u009c\2\2\u07d4\u07d9\7\u0174\2\2\u07d5\u07d6"+
		"\7\u015f\2\2\u07d6\u07d8\7\u0174\2\2\u07d7\u07d5\3\2\2\2\u07d8\u07db\3"+
		"\2\2\2\u07d9\u07d7\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u00ef\3\2\2\2\u07db"+
		"\u07d9\3\2\2\2\u07dc\u07dd\7\62\2\2\u07dd\u07de\t\36\2\2\u07de\u07df\7"+
		"\u00cd\2\2\u07df\u07e1\5\u0168\u00b5\2\u07e0\u07e2\5\u00f2z\2\u07e1\u07e0"+
		"\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u00f1\3\2\2\2\u07e3\u07e4\7\64\2\2"+
		"\u07e4\u07e5\7\u016d\2\2\u07e5\u07ea\5\u01d6\u00ec\2\u07e6\u07e7\7\u015f"+
		"\2\2\u07e7\u07e9\5\u01d6\u00ec\2\u07e8\u07e6\3\2\2\2\u07e9\u07ec\3\2\2"+
		"\2\u07ea\u07e8\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ed\3\2\2\2\u07ec\u07ea"+
		"\3\2\2\2\u07ed\u07ee\7\u0170\2\2\u07ee\u00f3\3\2\2\2\u07ef\u07f0\7/\2"+
		"\2\u07f0\u07f1\7\u0174\2\2\u07f1\u00f5\3\2\2\2\u07f2\u07f3\7\61\2\2\u07f3"+
		"\u07f4\t\37\2\2\u07f4\u07f5\5\u00f8}\2\u07f5\u07f6\7\u015f\2\2\u07f6\u07f7"+
		"\5\u00f8}\2\u07f7\u00f7\3\2\2\2\u07f8\u07fa\5\u0168\u00b5\2\u07f9\u07fb"+
		"\5\u016a\u00b6\2\u07fa\u07f9\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u0801\3"+
		"\2\2\2\u07fc\u07fd\7\u016d\2\2\u07fd\u07fe\5\u0138\u009d\2\u07fe\u07ff"+
		"\7\u0170\2\2\u07ff\u0801\3\2\2\2\u0800\u07f8\3\2\2\2\u0800\u07fc\3\2\2"+
		"\2\u0801\u0804\3\2\2\2\u0802\u0803\7\26\2\2\u0803\u0805\5\u01d6\u00ec"+
		"\2\u0804\u0802\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u00f9\3\2\2\2\u0806\u0807"+
		"\7=\2\2\u0807\u0808\7|\2\2\u0808\u0809\7\u00ab\2\2\u0809\u080e\5\u00fe"+
		"\u0080\2\u080a\u080b\7\u015f\2\2\u080b\u080d\5\u00fe\u0080\2\u080c\u080a"+
		"\3\2\2\2\u080d\u0810\3\2\2\2\u080e\u080c\3\2\2\2\u080e\u080f\3\2\2\2\u080f"+
		"\u0811\3\2\2\2\u0810\u080e\3\2\2\2\u0811\u0812\7\u0129\2\2\u0812\u0816"+
		"\5\u0100\u0081\2\u0813\u0815\5\u0104\u0083\2\u0814\u0813\3\2\2\2\u0815"+
		"\u0818\3\2\2\2\u0816\u0814\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u00fb\3\2"+
		"\2\2\u0818\u0816\3\2\2\2\u0819\u081f\7=\2\2\u081a\u0820\5\u0168\u00b5"+
		"\2\u081b\u081c\7\u016d\2\2\u081c\u081d\5\u0138\u009d\2\u081d\u081e\7\u0170"+
		"\2\2\u081e\u0820\3\2\2\2\u081f\u081a\3\2\2\2\u081f\u081b\3\2\2\2\u0820"+
		"\u0821\3\2\2\2\u0821\u0823\7\u0129\2\2\u0822\u0824\7\u0087\2\2\u0823\u0822"+
		"\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0829\5\u0100\u0081"+
		"\2\u0826\u0828\5\u0102\u0082\2\u0827\u0826\3\2\2\2\u0828\u082b\3\2\2\2"+
		"\u0829\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u00fd\3\2\2\2\u082b\u0829"+
		"\3\2\2\2\u082c\u082f\5\u01d0\u00e9\2\u082d\u082f\5\u019e\u00d0\2\u082e"+
		"\u082c\3\2\2\2\u082e\u082d\3\2\2\2\u082f\u00ff\3\2\2\2\u0830\u0833\5\u01d0"+
		"\u00e9\2\u0831\u0833\5\u019e\u00d0\2\u0832\u0830\3\2\2\2\u0832\u0831\3"+
		"\2\2\2\u0833\u0101\3\2\2\2\u0834\u0835\7\26\2\2\u0835\u083d\5\u01d6\u00ec"+
		"\2\u0836\u0837\7\31\2\2\u0837\u083d\5\u019e\u00d0\2\u0838\u0839\7W\2\2"+
		"\u0839\u083d\5\u019e\u00d0\2\u083a\u083b\7\u0112\2\2\u083b\u083d\5\u01d6"+
		"\u00ec\2\u083c\u0834\3\2\2\2\u083c\u0836\3\2\2\2\u083c\u0838\3\2\2\2\u083c"+
		"\u083a\3\2\2\2\u083d\u0103\3\2\2\2\u083e\u083f\t \2\2\u083f\u0105\3\2"+
		"\2\2\u0840\u0842\7\67\2\2\u0841\u0843\7\u0141\2\2\u0842\u0841\3\2\2\2"+
		"\u0842\u0843\3\2\2\2\u0843\u0107\3\2\2\2\u0844\u0846\7@\2\2\u0845\u0847"+
		"\7\u0130\2\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\3\2\2"+
		"\2\u0848\u0849\7\u0090\2\2\u0849\u084a\5\u01d6\u00ec\2\u084a\u084b\7\u00cd"+
		"\2\2\u084b\u084c\5\u0168\u00b5\2\u084c\u084d\7\u016d\2\2\u084d\u0852\5"+
		"\u010a\u0086\2\u084e\u084f\7\u015f\2\2\u084f\u0851\5\u010a\u0086\2\u0850"+
		"\u084e\3\2\2\2\u0851\u0854\3\2\2\2\u0852\u0850\3\2\2\2\u0852\u0853\3\2"+
		"\2\2\u0853\u0855\3\2\2\2\u0854\u0852\3\2\2\2";
	private static final String _serializedATNSegment1 =
		"\u0855\u0856\7\u0170\2\2\u0856\u0109\3\2\2\2\u0857\u0859\5\u01d6\u00ec"+
		"\2\u0858\u085a\t\13\2\2\u0859\u0858\3\2\2\2\u0859\u085a\3\2\2\2\u085a"+
		"\u010b\3\2\2\2\u085b\u085c\5\u010e\u0088\2\u085c\u010d\3\2\2\2\u085d\u085e"+
		"\7\u013f\2\2\u085e\u085f\7\u016d\2\2\u085f\u0860\5\u01d6\u00ec\2\u0860"+
		"\u0861\7\u0163\2\2\u0861\u0869\5\u01d6\u00ec\2\u0862\u0863\7\u015f\2\2"+
		"\u0863\u0864\5\u01d6\u00ec\2\u0864\u0865\7\u0163\2\2\u0865\u0866\5\u01d6"+
		"\u00ec\2\u0866\u0868\3\2\2\2\u0867\u0862\3\2\2\2\u0868\u086b\3\2\2\2\u0869"+
		"\u0867\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u086c\3\2\2\2\u086b\u0869\3\2"+
		"\2\2\u086c\u0870\7\u0170\2\2\u086d\u086f\5\u0088E\2\u086e\u086d\3\2\2"+
		"\2\u086f\u0872\3\2\2\2\u0870\u086e\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u010f"+
		"\3\2\2\2\u0872\u0870\3\2\2\2\u0873\u0874\7\u00df\2\2\u0874\u087b\5\u019e"+
		"\u00d0\2\u0875\u0876\7\u00df\2\2\u0876\u0877\7\u016d\2\2\u0877\u0878\5"+
		"\u019e\u00d0\2\u0878\u0879\7\u0170\2\2\u0879\u087b\3\2\2\2\u087a\u0873"+
		"\3\2\2\2\u087a\u0875\3\2\2\2\u087b\u0111\3\2\2\2\u087c\u087e\7\6\2\2\u087d"+
		"\u087c\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0881\7\u00e4"+
		"\2\2\u0880\u0882\5\u019e\u00d0\2\u0881\u0880\3\2\2\2\u0881\u0882\3\2\2"+
		"\2\u0882\u0113\3\2\2\2\u0883\u0884\7\u00e6\2\2\u0884\u0115\3\2\2\2\u0885"+
		"\u0891\7\u00eb\2\2\u0886\u0888\7\u0113\2\2\u0887\u0889\7\u0135\2\2\u0888"+
		"\u0887\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088f\5\u019e"+
		"\u00d0\2\u088b\u088c\7\u0105\2\2\u088c\u088d\7\u00b9\2\2\u088d\u088e\7"+
		"\u0163\2\2\u088e\u0890\5\u019e\u00d0\2\u088f\u088b\3\2\2\2\u088f\u0890"+
		"\3\2\2\2\u0890\u0892\3\2\2\2\u0891\u0886\3\2\2\2\u0891\u0892\3\2\2\2\u0892"+
		"\u0117\3\2\2\2\u0893\u0895\7\u00ef\2\2\u0894\u0896\5\u019e\u00d0\2\u0895"+
		"\u0894\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0119\3\2\2\2\u0897\u0899\7\u00f5"+
		"\2\2\u0898\u089a\7\u0141\2\2\u0899\u0898\3\2\2\2\u0899\u089a\3\2\2\2\u089a"+
		"\u011b\3\2\2\2\u089b\u089f\5\u011e\u0090\2\u089c\u089f\5\u0120\u0091\2"+
		"\u089d\u089f\5\u0122\u0092\2\u089e\u089b\3\2\2\2\u089e\u089c\3\2\2\2\u089e"+
		"\u089d\3\2\2\2\u089f\u011d\3\2\2\2\u08a0\u08a2\7D\2\2\u08a1\u08a0\3\2"+
		"\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a6\7\u00fe\2\2\u08a4"+
		"\u08a6\7E\2\2\u08a5\u08a1\3\2\2\2\u08a5\u08a4\3\2\2\2\u08a6\u08a8\3\2"+
		"\2\2\u08a7\u08a9\7\u0163\2\2\u08a8\u08a7\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9"+
		"\u08aa\3\2\2\2\u08aa\u08ab\5\u019e\u00d0\2\u08ab\u011f\3\2\2\2\u08ac\u08ad"+
		"\t!\2\2\u08ad\u08ae\t\"\2\2\u08ae\u0121\3\2\2\2\u08af\u08b0\7\u00e3\2"+
		"\2\u08b0\u08b3\7\u0163\2\2\u08b1\u08b4\5\u019e\u00d0\2\u08b2\u08b4\7\u00c5"+
		"\2\2\u08b3\u08b1\3\2\2\2\u08b3\u08b2\3\2\2\2\u08b4\u08b6\3\2\2\2\u08b5"+
		"\u08b7\7\u0131\2\2\u08b6\u08b5\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8"+
		"\3\2\2\2\u08b8\u08b9\7x\2\2\u08b9\u08ba\t#\2\2\u08ba\u0123\3\2\2\2\u08bb"+
		"\u08bc\7\u010a\2\2\u08bc\u08bd\5\u01d6\u00ec\2\u08bd\u0125\3\2\2\2\u08be"+
		"\u08c1\7\u011e\2\2\u08bf\u08c0\7\u012a\2\2\u08c0\u08c2\5\u019e\u00d0\2"+
		"\u08c1\u08bf\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08cd"+
		"\7x\2\2\u08c4\u08ce\5\u0138\u009d\2\u08c5\u08c7\5\u0168\u00b5\2\u08c6"+
		"\u08c8\5\u016a\u00b6\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08cb"+
		"\3\2\2\2\u08c9\u08ca\7\u00a9\2\2\u08ca\u08cc\5\u019e\u00d0\2\u08cb\u08c9"+
		"\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08ce\3\2\2\2\u08cd\u08c4\3\2\2\2\u08cd"+
		"\u08c5\3\2\2\2\u08ce\u0127\3\2\2\2\u08cf\u08d1\7\u012d\2\2\u08d0\u08d2"+
		"\7\u0120\2\2\u08d1\u08d0\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d3\3\2\2"+
		"\2\u08d3\u08d4\5\u0168\u00b5\2\u08d4\u0129\3\2\2\2\u08d5\u08d6\7\u0133"+
		"\2\2\u08d6\u08d7\5\u019e\u00d0\2\u08d7\u012b\3\2\2\2\u08d8\u08da\7\u0136"+
		"\2\2\u08d9\u08db\7\u016d\2\2\u08da\u08d9\3\2\2\2\u08da\u08db\3\2\2\2\u08db"+
		"\u08dc\3\2\2\2\u08dc\u08e1\5\u019e\u00d0\2\u08dd\u08de\7\u015f\2\2\u08de"+
		"\u08e0\5\u019e\u00d0\2\u08df\u08dd\3\2\2\2\u08e0\u08e3\3\2\2\2\u08e1\u08df"+
		"\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e4"+
		"\u08e6\7\u0170\2\2\u08e5\u08e4\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e7"+
		"\3\2\2\2\u08e7\u08e9\7\u009c\2\2\u08e8\u08ea\7\u016d\2\2\u08e9\u08e8\3"+
		"\2\2\2\u08e9\u08ea\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08f0\5\u01d6\u00ec"+
		"\2\u08ec\u08ed\7\u015f\2\2\u08ed\u08ef\5\u01d6\u00ec\2\u08ee\u08ec\3\2"+
		"\2\2\u08ef\u08f2\3\2\2\2\u08f0\u08ee\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1"+
		"\u08f4\3\2\2\2\u08f2\u08f0\3\2\2\2\u08f3\u08f5\7\u0170\2\2\u08f4\u08f3"+
		"\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u012d\3\2\2\2\u08f6\u08f7\7\u013e\2"+
		"\2\u08f7\u08f8\5\u018e\u00c8\2\u08f8\u08f9\t$\2\2\u08f9\u08fa\5\4\3\2"+
		"\u08fa\u08fc\7g\2\2\u08fb\u08fd\t%\2\2\u08fc\u08fb\3\2\2\2\u08fc\u08fd"+
		"\3\2\2\2\u08fd\u012f\3\2\2\2\u08fe\u08ff\7x\2\2\u08ff\u0900\7\u0174\2"+
		"\2\u0900\u0902\7\u008e\2\2\u0901\u0903\7\u016d\2\2\u0902\u0901\3\2\2\2"+
		"\u0902\u0903\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0906\5\u0138\u009d\2\u0905"+
		"\u0907\7\u0170\2\2\u0906\u0905\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0908"+
		"\3\2\2\2\u0908\u0909\7\u00b3\2\2\u0909\u090a\5\4\3\2\u090a\u090b\7g\2"+
		"\2\u090b\u090c\7\u00b3\2\2\u090c\u0131\3\2\2\2\u090d\u090e\7x\2\2\u090e"+
		"\u090f\7\u0174\2\2\u090f\u0911\7\u008e\2\2\u0910\u0912\7\u00f1\2\2\u0911"+
		"\u0910\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0914\5\u019e"+
		"\u00d0\2\u0914\u0915\7\u0162\2\2\u0915\u0918\5\u019e\u00d0\2\u0916\u0917"+
		"\t&\2\2\u0917\u0919\5\u019e\u00d0\2\u0918\u0916\3\2\2\2\u0918\u0919\3"+
		"\2\2\2\u0919\u091a\3\2\2\2\u091a\u091b\7\u00b3\2\2\u091b\u091c\5\4\3\2"+
		"\u091c\u091d\7g\2\2\u091d\u091e\7\u00b3\2\2\u091e\u0133\3\2\2\2\u091f"+
		"\u0926\7\u017d\2\2\u0920\u0921\7\u0169\2\2\u0921\u0922\7\u0169\2\2\u0922"+
		"\u0923\7\u0174\2\2\u0923\u0924\7\u0167\2\2\u0924\u0926\7\u0167\2\2\u0925"+
		"\u091f\3\2\2\2\u0925\u0920\3\2\2\2\u0926\u0135\3\2\2\2\u0927\u0928\7\u0134"+
		"\2\2\u0928\u092d\5\u019e\u00d0\2\u0929\u092a\7\u015f\2\2\u092a\u092c\5"+
		"\u019e\u00d0\2\u092b\u0929\3\2\2\2\u092c\u092f\3\2\2\2\u092d\u092b\3\2"+
		"\2\2\u092d\u092e\3\2\2\2\u092e\u0137\3\2\2\2\u092f\u092d\3\2\2\2\u0930"+
		"\u0932\5\u013a\u009e\2\u0931\u0930\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0933"+
		"\3\2\2\2\u0933\u0934\5\u0140\u00a1\2\u0934\u0139\3\2\2\2\u0935\u0936\7"+
		"\u013f\2\2\u0936\u093b\5\u013c\u009f\2\u0937\u0938\7\u015f\2\2\u0938\u093a"+
		"\5\u013c\u009f\2\u0939\u0937\3\2\2\2\u093a\u093d\3\2\2\2\u093b\u0939\3"+
		"\2\2\2\u093b\u093c\3\2\2\2\u093c\u013b\3\2\2\2\u093d\u093b\3\2\2\2\u093e"+
		"\u0940\5\u01d6\u00ec\2\u093f\u0941\5\u013e\u00a0\2\u0940\u093f\3\2\2\2"+
		"\u0940\u0941\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0943\7\23\2\2\u0943\u0944"+
		"\7\u016d\2\2\u0944\u0945\5\u0140\u00a1\2\u0945\u0946\7\u0170\2\2\u0946"+
		"\u013d\3\2\2\2\u0947\u0948\7\u016d\2\2\u0948\u094d\5\u01d6\u00ec\2\u0949"+
		"\u094a\7\u015f\2\2\u094a\u094c\5\u01d6\u00ec\2\u094b\u0949\3\2\2\2\u094c"+
		"\u094f\3\2\2\2\u094d\u094b\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u0950\3\2"+
		"\2\2\u094f\u094d\3\2\2\2\u0950\u0951\7\u0170\2\2\u0951\u013f\3\2\2\2\u0952"+
		"\u0958\5\u0142\u00a2\2\u0953\u0954\5\u0144\u00a3\2\u0954\u0955\5\u0142"+
		"\u00a2\2\u0955\u0957\3\2\2\2\u0956\u0953\3\2\2\2\u0957\u095a\3\2\2\2\u0958"+
		"\u0956\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u0141\3\2\2\2\u095a\u0958\3\2"+
		"\2\2\u095b\u0961\5\u0146\u00a4\2\u095c\u095d\7\u016d\2\2\u095d\u095e\5"+
		"\u0140\u00a1\2\u095e\u095f\7\u0170\2\2\u095f\u0961\3\2\2\2\u0960\u095b"+
		"\3\2\2\2\u0960\u095c\3\2\2\2\u0961\u0143\3\2\2\2\u0962\u0964\7\u012f\2"+
		"\2\u0963\u0965\7\r\2\2\u0964\u0963\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u096f"+
		"\3\2\2\2\u0966\u0968\7j\2\2\u0967\u0969\7\r\2\2\u0968\u0967\3\2\2\2\u0968"+
		"\u0969\3\2\2\2\u0969\u096f\3\2\2\2\u096a\u096c\7\u009a\2\2\u096b\u096d"+
		"\7\r\2\2\u096c\u096b\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096f\3\2\2\2\u096e"+
		"\u0962\3\2\2\2\u096e\u0966\3\2\2\2\u096e\u096a\3\2\2\2\u096f\u0145\3\2"+
		"\2\2\u0970\u0971\t\'\2\2\u0971\u0973\5\u0148\u00a5\2\u0972\u0974\5\u0154"+
		"\u00ab\2\u0973\u0972\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0976\3\2\2\2\u0975"+
		"\u0977\5\u0156\u00ac\2\u0976\u0975\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0979"+
		"\3\2\2\2\u0978\u097a\5\u016a\u00b6\2\u0979\u0978\3\2\2\2\u0979\u097a\3"+
		"\2\2\2\u097a\u097c\3\2\2\2\u097b\u097d\5\u016c\u00b7\2\u097c\u097b\3\2"+
		"\2\2\u097c\u097d\3\2\2\2\u097d\u0980\3\2\2\2\u097e\u0981\5\u016e\u00b8"+
		"\2\u097f\u0981\5\u0170\u00b9\2\u0980\u097e\3\2\2\2\u0980\u097f\3\2\2\2"+
		"\u0980\u0981\3\2\2\2\u0981\u0983\3\2\2\2\u0982\u0984\5\u0172\u00ba\2\u0983"+
		"\u0982\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0986\3\2\2\2\u0985\u0987\5\u0174"+
		"\u00bb\2\u0986\u0985\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0147\3\2\2\2\u0988"+
		"\u098a\5\u014a\u00a6\2\u0989\u0988\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u098c"+
		"\3\2\2\2\u098b\u098d\5\u014c\u00a7\2\u098c\u098b\3\2\2\2\u098c\u098d\3"+
		"\2\2\2\u098d\u098e\3\2\2\2\u098e\u0993\5\u014e\u00a8\2\u098f\u0990\7\u015f"+
		"\2\2\u0990\u0992\5\u014e\u00a8\2\u0991\u098f\3\2\2\2\u0992\u0995\3\2\2"+
		"\2\u0993\u0991\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0149\3\2\2\2\u0995\u0993"+
		"\3\2\2\2\u0996\u0997\t(\2\2\u0997\u014b\3\2\2\2\u0998\u0999\7\u012a\2"+
		"\2\u0999\u099a\5\u019e\u00d0\2\u099a\u014d\3\2\2\2\u099b\u099c\5\u01d6"+
		"\u00ec\2\u099c\u099d\7\u0163\2\2\u099d\u099f\3\2\2\2\u099e\u099b\3\2\2"+
		"\2\u099e\u099f\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a2\5\u019e\u00d0\2"+
		"\u09a1\u09a3\5\u0150\u00a9\2\u09a2\u09a1\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3"+
		"\u09a6\3\2\2\2\u09a4\u09a6\5\u0152\u00aa\2\u09a5\u099e\3\2\2\2\u09a5\u09a4"+
		"\3\2\2\2\u09a6\u014f\3\2\2\2\u09a7\u09a9\6\u00a9\5\2\u09a8\u09aa\7\23"+
		"\2\2\u09a9\u09a8\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab"+
		"\u09b1\5\u01d6\u00ec\2\u09ac\u09ad\7\u016d\2\2\u09ad\u09ae\7\u0128\2\2"+
		"\u09ae\u09af\7\u0175\2\2\u09af\u09b1\7\u0170\2\2\u09b0\u09a7\3\2\2\2\u09b0"+
		"\u09ac\3\2\2\2\u09b1\u0151\3\2\2\2\u09b2\u09b3\7\u0174\2\2\u09b3\u09b5"+
		"\7\6\2\2\u09b4\u09b2\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6"+
		"\u09b7\7\u016b\2\2\u09b7\u0153\3\2\2\2\u09b8\u09b9\7\u009c\2\2\u09b9\u09be"+
		"\5\u01d6\u00ec\2\u09ba\u09bb\7\u015f\2\2\u09bb\u09bd\5\u01d6\u00ec\2\u09bc"+
		"\u09ba\3\2\2\2\u09bd\u09c0\3\2\2\2\u09be\u09bc\3\2\2\2\u09be\u09bf\3\2"+
		"\2\2\u09bf\u0155\3\2\2\2\u09c0\u09be\3\2\2\2\u09c1\u09c2\7|\2\2\u09c2"+
		"\u09c6\5\u0158\u00ad\2\u09c3\u09c5\5\u015e\u00b0\2\u09c4\u09c3\3\2\2\2"+
		"\u09c5\u09c8\3\2\2\2\u09c6\u09c4\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u0157"+
		"\3\2\2\2\u09c8\u09c6\3\2\2\2\u09c9\u09cd\5\u015a\u00ae\2\u09ca\u09cd\5"+
		"\u015c\u00af\2\u09cb\u09cd\5\u0162\u00b2\2\u09cc\u09c9\3\2\2\2\u09cc\u09ca"+
		"\3\2\2\2\u09cc\u09cb\3\2\2\2\u09cd\u0159\3\2\2\2\u09ce\u09d0\5\u0168\u00b5"+
		"\2\u09cf\u09d1\5\u0166\u00b4\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2"+
		"\u09d1\u015b\3\2\2\2\u09d2\u09d3\7\u016d\2\2\u09d3\u09d4\5\u0138\u009d"+
		"\2\u09d4\u09d6\7\u0170\2\2\u09d5\u09d7\5\u0166\u00b4\2\u09d6\u09d5\3\2"+
		"\2\2\u09d6\u09d7\3\2\2\2\u09d7\u015d\3\2\2\2\u09d8\u09d9\7\u015f\2\2\u09d9"+
		"\u09e0\5\u0158\u00ad\2\u09da\u09db\5\u0160\u00b1\2\u09db\u09dc\5\u0158"+
		"\u00ad\2\u09dc\u09dd\7\u00cd\2\2\u09dd\u09de\5\u018e\u00c8\2\u09de\u09e0"+
		"\3\2\2\2\u09df\u09d8\3\2\2\2\u09df\u09da\3\2\2\2\u09e0\u015f\3\2\2\2\u09e1"+
		"\u09e3\7\u0092\2\2\u09e2\u09e1\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4"+
		"\3\2\2\2\u09e4\u09eb\7\u00a1\2\2\u09e5\u09e7\t)\2\2\u09e6\u09e8\7\u00d3"+
		"\2\2\u09e7\u09e6\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9"+
		"\u09eb\7\u00a1\2\2\u09ea\u09e2\3\2\2\2\u09ea\u09e5\3\2\2\2\u09eb\u0161"+
		"\3\2\2\2\u09ec\u09ed\7\u0120\2\2\u09ed\u09ee\7\u016d\2\2\u09ee\u09ef\7"+
		"\u0136\2\2\u09ef\u09f4\5\u0164\u00b3\2\u09f0\u09f1\7\u015f\2\2\u09f1\u09f3"+
		"\5\u0164\u00b3\2\u09f2\u09f0\3\2\2\2\u09f3\u09f6\3\2\2\2\u09f4\u09f2\3"+
		"\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u09f7\3\2\2\2\u09f6\u09f4\3\2\2\2\u09f7"+
		"\u09f9\7\u0170\2\2\u09f8\u09fa\5\u0166\u00b4\2\u09f9\u09f8\3\2\2\2\u09f9"+
		"\u09fa\3\2\2\2\u09fa\u0163\3\2\2\2\u09fb\u0a08\5\u019e\u00d0\2\u09fc\u09fd"+
		"\7\u016d\2\2\u09fd\u0a02\5\u019e\u00d0\2\u09fe\u09ff\7\u015f\2\2\u09ff"+
		"\u0a01\5\u019e\u00d0\2\u0a00\u09fe\3\2\2\2\u0a01\u0a04\3\2\2\2\u0a02\u0a00"+
		"\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a05\3\2\2\2\u0a04\u0a02\3\2\2\2\u0a05"+
		"\u0a06\7\u0170\2\2\u0a06\u0a08\3\2\2\2\u0a07\u09fb\3\2\2\2\u0a07\u09fc"+
		"\3\2\2\2\u0a08\u0165\3\2\2\2\u0a09\u0a0b\6\u00b4\6\2\u0a0a\u0a0c\7\23"+
		"\2\2\u0a0b\u0a0a\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d"+
		"\u0a18\5\u01d6\u00ec\2\u0a0e\u0a0f\7\u016d\2\2\u0a0f\u0a14\7\u0174\2\2"+
		"\u0a10\u0a11\7\u015f\2\2\u0a11\u0a13\7\u0174\2\2\u0a12\u0a10\3\2\2\2\u0a13"+
		"\u0a16\3\2\2\2\u0a14\u0a12\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a17\3\2"+
		"\2\2\u0a16\u0a14\3\2\2\2\u0a17\u0a19\7\u0170\2\2\u0a18\u0a0e\3\2\2\2\u0a18"+
		"\u0a19\3\2\2\2\u0a19\u0167\3\2\2\2\u0a1a\u0a1b\5\u01d6\u00ec\2\u0a1b\u0169"+
		"\3\2\2\2\u0a1c\u0a1d\7\u013d\2\2\u0a1d\u0a1e\5\u018e\u00c8\2\u0a1e\u016b"+
		"\3\2\2\2\u0a1f\u0a20\7\u0083\2\2\u0a20\u0a21\7#\2\2\u0a21\u0a26\5\u019e"+
		"\u00d0\2\u0a22\u0a23\7\u015f\2\2\u0a23\u0a25\5\u019e\u00d0\2\u0a24\u0a22"+
		"\3\2\2\2\u0a25\u0a28\3\2\2\2\u0a26\u0a24\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27"+
		"\u016d\3\2\2\2\u0a28\u0a26\3\2\2\2\u0a29\u0a2a\7\u0086\2\2\u0a2a\u0a2b"+
		"\5\u018e\u00c8\2\u0a2b\u016f\3\2\2\2\u0a2c\u0a2d\7\u00e2\2\2\u0a2d\u0a2e"+
		"\5\u018e\u00c8\2\u0a2e\u0171\3\2\2\2\u0a2f\u0a30\7\u00d1\2\2\u0a30\u0a31"+
		"\7#\2\2\u0a31\u0a33\5\u019e\u00d0\2\u0a32\u0a34\t\13\2\2\u0a33\u0a32\3"+
		"\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a3c\3\2\2\2\u0a35\u0a36\7\u015f\2\2"+
		"\u0a36\u0a38\5\u019e\u00d0\2\u0a37\u0a39\t\13\2\2\u0a38\u0a37\3\2\2\2"+
		"\u0a38\u0a39\3\2\2\2\u0a39\u0a3b\3\2\2\2\u0a3a\u0a35\3\2\2\2\u0a3b\u0a3e"+
		"\3\2\2\2\u0a3c\u0a3a\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0173\3\2\2\2\u0a3e"+
		"\u0a3c\3\2\2\2\u0a3f\u0a41\5\u0176\u00bc\2\u0a40\u0a3f\3\2\2\2\u0a41\u0a42"+
		"\3\2\2\2\u0a42\u0a40\3\2\2\2\u0a42\u0a43\3\2\2\2\u0a43\u0175\3\2\2\2\u0a44"+
		"\u0a45\7\u00a9\2\2\u0a45\u0a50\5\u019e\u00d0\2\u0a46\u0a47\7\u013f\2\2"+
		"\u0a47\u0a4d\t*\2\2\u0a48\u0a49\7\u0133\2\2\u0a49\u0a4a\7\20\2\2\u0a4a"+
		"\u0a4b\7\u00a2\2\2\u0a4b\u0a4c\t+\2\2\u0a4c\u0a4e\7\u00af\2\2\u0a4d\u0a48"+
		"\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a50\3\2\2\2\u0a4f\u0a44\3\2\2\2\u0a4f"+
		"\u0a46\3\2\2\2\u0a50\u0177\3\2\2\2\u0a51\u0a52\7\u0131\2\2\u0a52\u0a53"+
		"\5\u017c\u00bf\2\u0a53\u0a54\7\u0105\2\2\u0a54\u0a56\5\u017a\u00be\2\u0a55"+
		"\u0a57\5\u016a\u00b6\2\u0a56\u0a55\3\2\2\2\u0a56\u0a57\3\2\2\2\u0a57\u0a59"+
		"\3\2\2\2\u0a58\u0a5a\5\u017e\u00c0\2\u0a59\u0a58\3\2\2\2\u0a59\u0a5a\3"+
		"\2\2\2\u0a5a\u0179\3\2\2\2\u0a5b\u0a60\5\34\17\2\u0a5c\u0a5d\7\u015f\2"+
		"\2\u0a5d\u0a5f\5\34\17\2\u0a5e\u0a5c\3\2\2\2\u0a5f\u0a62\3\2\2\2\u0a60"+
		"\u0a5e\3\2\2\2\u0a60\u0a61\3\2\2\2\u0a61\u017b\3\2\2\2\u0a62\u0a60\3\2"+
		"\2\2\u0a63\u0a65\5\u0168\u00b5\2\u0a64\u0a66\5\u0156\u00ac\2\u0a65\u0a64"+
		"\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a6c\3\2\2\2\u0a67\u0a68\7\u016d\2"+
		"\2\u0a68\u0a69\5\u0138\u009d\2\u0a69\u0a6a\7\u0170\2\2\u0a6a\u0a6c\3\2"+
		"\2\2\u0a6b\u0a63\3\2\2\2\u0a6b\u0a67\3\2\2\2\u0a6c\u0a71\3\2\2\2\u0a6d"+
		"\u0a6f\7\23\2\2\u0a6e\u0a6d\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a70\3"+
		"\2\2\2\u0a70\u0a72\5\u01d6\u00ec\2\u0a71\u0a6e\3\2\2\2\u0a71\u0a72\3\2"+
		"\2\2\u0a72\u017d\3\2\2\2\u0a73\u0a74\7c\2\2\u0a74\u0a75\5\u00d0i\2\u0a75"+
		"\u017f\3\2\2\2\u0a76\u0a77\7\u00b8\2\2\u0a77\u0a78\7\u009c\2\2\u0a78\u0a79"+
		"\5\u0182\u00c2\2\u0a79\u0a7a\7\u0134\2\2\u0a7a\u0a7b\5\u0182\u00c2\2\u0a7b"+
		"\u0a7c\7\u00cd\2\2\u0a7c\u0a7e\5\u018e\u00c8\2\u0a7d\u0a7f\5\u0184\u00c3"+
		"\2\u0a7e\u0a7d\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a7e\3\2\2\2\u0a80\u0a81"+
		"\3\2\2\2\u0a81\u0181\3\2\2\2\u0a82\u0a88\5\u0168\u00b5\2\u0a83\u0a84\7"+
		"\u016d\2\2\u0a84\u0a85\5\u0138\u009d\2\u0a85\u0a86\7\u0170\2\2\u0a86\u0a88"+
		"\3\2\2\2\u0a87\u0a82\3\2\2\2\u0a87\u0a83\3\2\2\2\u0a88\u0a8d\3\2\2\2\u0a89"+
		"\u0a8b\7\23\2\2\u0a8a\u0a89\3\2\2\2\u0a8a\u0a8b\3\2\2\2\u0a8b\u0a8c\3"+
		"\2\2\2\u0a8c\u0a8e\5\u01d6\u00ec\2\u0a8d\u0a8a\3\2\2\2\u0a8d\u0a8e\3\2"+
		"\2\2\u0a8e\u0183\3\2\2\2\u0a8f\u0a91\7\u013c\2\2\u0a90\u0a92\7\u00c6\2"+
		"\2\u0a91\u0a90\3\2\2\2\u0a91\u0a92\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93\u0a96"+
		"\7\u00b5\2\2\u0a94\u0a95\7\20\2\2\u0a95\u0a97\5\u018e\u00c8\2\u0a96\u0a94"+
		"\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u0a99\7\u0125\2"+
		"\2\u0a99\u0a9d\5\u0186\u00c4\2\u0a9a\u0a9b\7c\2\2\u0a9b\u0a9d\7\u008c"+
		"\2\2\u0a9c\u0a8f\3\2\2\2\u0a9c\u0a9a\3\2\2\2\u0a9d\u0185\3\2\2\2\u0a9e"+
		"\u0aa0\7\u0094\2\2\u0a9f\u0aa1\5\u00d2j\2\u0aa0\u0a9f\3\2\2\2\u0aa0\u0aa1"+
		"\3\2\2\2\u0aa1\u0aa2\3\2\2\2\u0aa2\u0aa3\7\u0136\2\2\u0aa3\u0ab3\5\u00d6"+
		"l\2\u0aa4\u0aa5\7\u0131\2\2\u0aa5\u0aa6\7\u0105\2\2\u0aa6\u0aab\5\34\17"+
		"\2\u0aa7\u0aa8\7\u015f\2\2\u0aa8\u0aaa\5\34\17\2\u0aa9\u0aa7\3\2\2\2\u0aaa"+
		"\u0aad\3\2\2\2\u0aab\u0aa9\3\2\2\2\u0aab\u0aac\3\2\2\2\u0aac\u0aaf\3\2"+
		"\2\2\u0aad\u0aab\3\2\2\2\u0aae\u0ab0\5\u016a\u00b6\2\u0aaf\u0aae\3\2\2"+
		"\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0ab3\3\2\2\2\u0ab1\u0ab3\7U\2\2\u0ab2\u0a9e"+
		"\3\2\2\2\u0ab2\u0aa4\3\2\2\2\u0ab2\u0ab1\3\2\2\2\u0ab3\u0187\3\2\2\2\u0ab4"+
		"\u0ab6\7U\2\2\u0ab5\u0ab7\7|\2\2\u0ab6\u0ab5\3\2\2\2\u0ab6\u0ab7\3\2\2"+
		"\2\u0ab7\u0ab8\3\2\2\2\u0ab8\u0aba\5\u0168\u00b5\2\u0ab9\u0abb\5\u018a"+
		"\u00c6\2\u0aba\u0ab9\3\2\2\2\u0aba\u0abb\3\2\2\2\u0abb\u0abe\3\2\2\2\u0abc"+
		"\u0abf\5\u016a\u00b6\2\u0abd\u0abf\7\r\2\2\u0abe\u0abc\3\2\2\2\u0abe\u0abd"+
		"\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0189\3\2\2\2\u0ac0\u0ac2\6\u00c6\7"+
		"\2\u0ac1\u0ac3\7\23\2\2\u0ac2\u0ac1\3\2\2\2\u0ac2\u0ac3\3\2\2\2\u0ac3"+
		"\u0ac4\3\2\2\2\u0ac4\u0ac5\5\u01d6\u00ec\2\u0ac5\u018b\3\2\2\2\u0ac6\u0ac8"+
		"\t,\2\2\u0ac7\u0ac9\7\u0120\2\2\u0ac8\u0ac7\3\2\2\2\u0ac8\u0ac9\3\2\2"+
		"\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acb\5\u0168\u00b5\2\u0acb\u018d\3\2\2\2"+
		"\u0acc\u0ace\b\u00c8\1\2\u0acd\u0acf\7\u00c6\2\2\u0ace\u0acd\3\2\2\2\u0ace"+
		"\u0acf\3\2\2\2\u0acf\u0ad0\3\2\2\2\u0ad0\u0ad1\7\u016d\2\2\u0ad1\u0ad2"+
		"\5\u018e\u00c8\2\u0ad2\u0ad3\7\u0170\2\2\u0ad3\u0ad6\3\2\2\2\u0ad4\u0ad6"+
		"\5\u0190\u00c9\2\u0ad5\u0acc\3\2\2\2\u0ad5\u0ad4\3\2\2\2\u0ad6\u0add\3"+
		"\2\2\2\u0ad7\u0ad8\f\4\2\2\u0ad8\u0ad9\5\u019a\u00ce\2\u0ad9\u0ada\5\u018e"+
		"\u00c8\5\u0ada\u0adc\3\2\2\2\u0adb\u0ad7\3\2\2\2\u0adc\u0adf\3\2\2\2\u0add"+
		"\u0adb\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade\u018f\3\2\2\2\u0adf\u0add\3\2"+
		"\2\2\u0ae0\u0ae4\5\u0192\u00ca\2\u0ae1\u0ae4\5\u0198\u00cd\2\u0ae2\u0ae4"+
		"\5\u019e\u00d0\2\u0ae3\u0ae0\3\2\2\2\u0ae3\u0ae1\3\2\2\2\u0ae3\u0ae2\3"+
		"\2\2\2\u0ae4\u0191\3\2\2\2\u0ae5\u0ae6\5\u019e\u00d0\2\u0ae6\u0ae8\7\u009e"+
		"\2\2\u0ae7\u0ae9\7\u00c6\2\2\u0ae8\u0ae7\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9"+
		"\u0aea\3\2\2\2\u0aea\u0aeb\7\u00c8\2\2\u0aeb\u0afd\3\2\2\2\u0aec\u0aed"+
		"\5\u019e\u00d0\2\u0aed\u0aee\7\33\2\2\u0aee\u0aef\5\u019e\u00d0\2\u0aef"+
		"\u0af0\7\20\2\2\u0af0\u0af1\5\u019e\u00d0\2\u0af1\u0afd\3\2\2\2\u0af2"+
		"\u0af4\7\u00c6\2\2\u0af3\u0af2\3\2\2\2\u0af3\u0af4\3\2\2\2\u0af4\u0af5"+
		"\3\2\2\2\u0af5\u0af6\7o\2\2\u0af6\u0af7\7\u016d\2\2\u0af7\u0af8\5\u0138"+
		"\u009d\2\u0af8\u0af9\7\u0170\2\2\u0af9\u0afd\3\2\2\2\u0afa\u0afd\5\u0194"+
		"\u00cb\2\u0afb\u0afd\5\u0196\u00cc\2\u0afc\u0ae5\3\2\2\2\u0afc\u0aec\3"+
		"\2\2\2\u0afc\u0af3\3\2\2\2\u0afc\u0afa\3\2\2\2\u0afc\u0afb\3\2\2\2\u0afd"+
		"\u0193\3\2\2\2\u0afe\u0b00\5\u019e\u00d0\2\u0aff\u0b01\7\u00c6\2\2\u0b00"+
		"\u0aff\3\2\2\2\u0b00\u0b01\3\2\2\2\u0b01\u0b02\3\2\2\2\u0b02\u0b03\7\u008e"+
		"\2\2\u0b03\u0b0d\7\u016d\2\2\u0b04\u0b09\5\u019e\u00d0\2\u0b05\u0b06\7"+
		"\u015f\2\2\u0b06\u0b08\5\u019e\u00d0\2\u0b07\u0b05\3\2\2\2\u0b08\u0b0b"+
		"\3\2\2\2\u0b09\u0b07\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a\u0b0e\3\2\2\2\u0b0b"+
		"\u0b09\3\2\2\2\u0b0c\u0b0e\5\u0138\u009d\2\u0b0d\u0b04\3\2\2\2\u0b0d\u0b0c"+
		"\3\2\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b10\7\u0170\2\2\u0b10\u0195\3\2\2"+
		"\2\u0b11\u0b12\7\u016d\2\2\u0b12\u0b17\5\u019e\u00d0\2\u0b13\u0b14\7\u015f"+
		"\2\2\u0b14\u0b16\5\u019e\u00d0\2\u0b15\u0b13\3\2\2\2\u0b16\u0b19\3\2\2"+
		"\2\u0b17\u0b15\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18\u0b1a\3\2\2\2\u0b19\u0b17"+
		"\3\2\2\2\u0b1a\u0b1c\7\u0170\2\2\u0b1b\u0b1d\7\u00c6\2\2\u0b1c\u0b1b\3"+
		"\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u0b1e\3\2\2\2\u0b1e\u0b1f\7\u008e\2\2"+
		"\u0b1f\u0b20\7\u016d\2\2\u0b20\u0b21\5\u0138\u009d\2\u0b21\u0b22\7\u0170"+
		"\2\2\u0b22\u0197\3\2\2\2\u0b23\u0b24\5\u019e\u00d0\2\u0b24\u0b25\5\u019c"+
		"\u00cf\2\u0b25\u0b26\5\u019e\u00d0\2\u0b26\u0199\3\2\2\2\u0b27\u0b28\t"+
		"-\2\2\u0b28\u019b\3\2\2\2\u0b29\u0b36\7\u0163\2\2\u0b2a\u0b36\7\u0164"+
		"\2\2\u0b2b\u0b36\7\u0165\2\2\u0b2c\u0b36\7\u0166\2\2\u0b2d\u0b36\7\u0169"+
		"\2\2\u0b2e\u0b36\7\u016a\2\2\u0b2f\u0b36\7\u0167\2\2\u0b30\u0b36\7\u0168"+
		"\2\2\u0b31\u0b33\7\u00c6\2\2\u0b32\u0b31\3\2\2\2\u0b32\u0b33\3\2\2\2\u0b33"+
		"\u0b34\3\2\2\2\u0b34\u0b36\t.\2\2\u0b35\u0b29\3\2\2\2\u0b35\u0b2a\3\2"+
		"\2\2\u0b35\u0b2b\3\2\2\2\u0b35\u0b2c\3\2\2\2\u0b35\u0b2d\3\2\2\2\u0b35"+
		"\u0b2e\3\2\2\2\u0b35\u0b2f\3\2\2\2\u0b35\u0b30\3\2\2\2\u0b35\u0b32\3\2"+
		"\2\2\u0b36\u019d\3\2\2\2\u0b37\u0b38\b\u00d0\1\2\u0b38\u0b39\7\u016d\2"+
		"\2\u0b39\u0b3a\5\u0138\u009d\2\u0b3a\u0b3b\7\u0170\2\2\u0b3b\u0b49\3\2"+
		"\2\2\u0b3c\u0b3d\7\u016d\2\2\u0b3d\u0b3e\5\u019e\u00d0\2\u0b3e\u0b3f\7"+
		"\u0170\2\2\u0b3f\u0b49\3\2\2\2\u0b40\u0b49\5\u01a2\u00d2\2\u0b41\u0b49"+
		"\5\u01a6\u00d4\2\u0b42\u0b49\5\u01aa\u00d6\2\u0b43\u0b49\5\u01b0\u00d9"+
		"\2\u0b44\u0b49\5\u01b2\u00da\2\u0b45\u0b49\5\u01ba\u00de\2\u0b46\u0b49"+
		"\5\u01bc\u00df\2\u0b47\u0b49\5\u01a0\u00d1\2\u0b48\u0b37\3\2\2\2\u0b48"+
		"\u0b3c\3\2\2\2\u0b48\u0b40\3\2\2\2\u0b48\u0b41\3\2\2\2\u0b48\u0b42\3\2"+
		"\2\2\u0b48\u0b43\3\2\2\2\u0b48\u0b44\3\2\2\2\u0b48\u0b45\3\2\2\2\u0b48"+
		"\u0b46\3\2\2\2\u0b48\u0b47\3\2\2\2\u0b49\u0b5a\3\2\2\2\u0b4a\u0b4b\f\20"+
		"\2\2\u0b4b\u0b4c\7\u016b\2\2\u0b4c\u0b59\5\u019e\u00d0\21\u0b4d\u0b4e"+
		"\f\17\2\2\u0b4e\u0b4f\7\u0161\2\2\u0b4f\u0b59\5\u019e\u00d0\20\u0b50\u0b51"+
		"\f\16\2\2\u0b51\u0b52\7\u015d\2\2\u0b52\u0b59\5\u019e\u00d0\17\u0b53\u0b54"+
		"\f\r\2\2\u0b54\u0b55\7\u0173\2\2\u0b55\u0b59\5\u019e\u00d0\16\u0b56\u0b57"+
		"\f\21\2\2\u0b57\u0b59\5\u01a4\u00d3\2\u0b58\u0b4a\3\2\2\2\u0b58\u0b4d"+
		"\3\2\2\2\u0b58\u0b50\3\2\2\2\u0b58\u0b53\3\2\2\2\u0b58\u0b56\3\2\2\2\u0b59"+
		"\u0b5c\3\2\2\2\u0b5a\u0b58\3\2\2\2\u0b5a\u0b5b\3\2\2\2\u0b5b\u019f\3\2"+
		"\2\2\u0b5c\u0b5a\3\2\2\2\u0b5d\u0b66\5\u01d2\u00ea\2\u0b5e\u0b66\5\u01d4"+
		"\u00eb\2\u0b5f\u0b66\5\u01de\u00f0\2\u0b60\u0b66\5\u01d6\u00ec\2\u0b61"+
		"\u0b66\5\u01d8\u00ed\2\u0b62\u0b66\5\u01dc\u00ef\2\u0b63\u0b66\5\u01da"+
		"\u00ee\2\u0b64\u0b66\5\u01e0\u00f1\2\u0b65\u0b5d\3\2\2\2\u0b65\u0b5e\3"+
		"\2\2\2\u0b65\u0b5f\3\2\2\2\u0b65\u0b60\3\2\2\2\u0b65\u0b61\3\2\2\2\u0b65"+
		"\u0b62\3\2\2\2\u0b65\u0b63\3\2\2\2\u0b65\u0b64\3\2\2\2\u0b66\u01a1\3\2"+
		"\2\2\u0b67\u0b68\7\u009b\2\2\u0b68\u0b69\5\u019e\u00d0\2\u0b69\u0b6a\5"+
		"\u01a4\u00d3\2\u0b6a\u01a3\3\2\2\2\u0b6b\u0b6c\t/\2\2\u0b6c\u01a5\3\2"+
		"\2\2\u0b6d\u0b6e\5\u01a8\u00d5\2\u0b6e\u0b6f\t\60\2\2\u0b6f\u0b74\5\u01a8"+
		"\u00d5\2\u0b70\u0b71\t\60\2\2\u0b71\u0b73\5\u01a8\u00d5\2\u0b72\u0b70"+
		"\3\2\2\2\u0b73\u0b76\3\2\2\2\u0b74\u0b72\3\2\2\2\u0b74\u0b75\3\2\2\2\u0b75"+
		"\u01a7\3\2\2\2\u0b76\u0b74\3\2\2\2\u0b77\u0b78\7\u016d\2\2\u0b78\u0b79"+
		"\5\u019e\u00d0\2\u0b79\u0b7a\7\u0170\2\2\u0b7a\u0b81\3\2\2\2\u0b7b\u0b81"+
		"\5\u01aa\u00d6\2\u0b7c\u0b81\5\u01b2\u00da\2\u0b7d\u0b81\5\u01ba\u00de"+
		"\2\u0b7e\u0b81\5\u01bc\u00df\2\u0b7f\u0b81\5\u01a0\u00d1\2\u0b80\u0b77"+
		"\3\2\2\2\u0b80\u0b7b\3\2\2\2\u0b80\u0b7c\3\2\2\2\u0b80\u0b7d\3\2\2\2\u0b80"+
		"\u0b7e\3\2\2\2\u0b80\u0b7f\3\2\2\2\u0b81\u01a9\3\2\2\2\u0b82\u0b85\5\u01ac"+
		"\u00d7\2\u0b83\u0b85\5\u01ae\u00d8\2\u0b84\u0b82\3\2\2\2\u0b84\u0b83\3"+
		"\2\2\2\u0b85\u01ab\3\2\2\2\u0b86\u0b87\7(\2\2\u0b87\u0b8d\5\u019e\u00d0"+
		"\2\u0b88\u0b89\7\u013c\2\2\u0b89\u0b8a\5\u019e\u00d0\2\u0b8a\u0b8b\7\u0125"+
		"\2\2\u0b8b\u0b8c\5\u019e\u00d0\2\u0b8c\u0b8e\3\2\2\2\u0b8d\u0b88\3\2\2"+
		"\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0b8d\3\2\2\2\u0b8f\u0b90\3\2\2\2\u0b90\u0b93"+
		"\3\2\2\2\u0b91\u0b92\7c\2\2\u0b92\u0b94\5\u019e\u00d0\2\u0b93\u0b91\3"+
		"\2\2\2\u0b93\u0b94\3\2\2\2\u0b94\u0b95\3\2\2\2\u0b95\u0b96\7g\2\2\u0b96"+
		"\u01ad\3\2\2\2\u0b97\u0b9d\7(\2\2\u0b98\u0b99\7\u013c\2\2\u0b99\u0b9a"+
		"\5\u018e\u00c8\2\u0b9a\u0b9b\7\u0125\2\2\u0b9b\u0b9c\5\u019e\u00d0\2\u0b9c"+
		"\u0b9e\3\2\2\2\u0b9d\u0b98\3\2\2\2\u0b9e\u0b9f\3\2\2\2\u0b9f\u0b9d\3\2"+
		"\2\2\u0b9f\u0ba0\3\2\2\2\u0ba0\u0ba3\3\2\2\2\u0ba1\u0ba2\7c\2\2\u0ba2"+
		"\u0ba4\5\u019e\u00d0\2\u0ba3\u0ba1\3\2\2\2\u0ba3\u0ba4\3\2\2\2\u0ba4\u0ba5"+
		"\3\2\2\2\u0ba5\u0ba6\7g\2\2\u0ba6\u01af\3\2\2\2\u0ba7\u0ba8\5\u01d6\u00ec"+
		"\2\u0ba8\u0ba9\7\5\2\2\u0ba9\u0baa\t\61\2\2\u0baa\u01b1\3\2\2\2\u0bab"+
		"\u0bac\7\30\2\2\u0bac\u0bae\7\u016d\2\2\u0bad\u0baf\5\u01b4\u00db\2\u0bae"+
		"\u0bad\3\2\2\2\u0bae\u0baf\3\2\2\2\u0baf\u0bb0\3\2\2\2\u0bb0\u0bb1\5\u019e"+
		"\u00d0\2\u0bb1\u0bb3\7\u0170\2\2\u0bb2\u0bb4\5\u01b6\u00dc\2\u0bb3\u0bb2"+
		"\3\2\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4\u0c44\3\2\2\2\u0bb5\u0bb6\7>\2\2\u0bb6"+
		"\u0bbc\7\u016d\2\2\u0bb7\u0bb9\5\u01b4\u00db\2\u0bb8\u0bb7\3\2\2\2\u0bb8"+
		"\u0bb9\3\2\2\2\u0bb9\u0bba\3\2\2\2\u0bba\u0bbd\5\u019e\u00d0\2\u0bbb\u0bbd"+
		"\7\u016b\2\2\u0bbc\u0bb8\3\2\2\2\u0bbc\u0bbb\3\2\2\2\u0bbd\u0bbe\3\2\2"+
		"\2\u0bbe\u0bc0\7\u0170\2\2\u0bbf\u0bc1\5\u01b6\u00dc\2\u0bc0\u0bbf\3\2"+
		"\2\2\u0bc0\u0bc1\3\2\2\2\u0bc1\u0c44\3\2\2\2\u0bc2\u0bc3\7?\2\2\u0bc3"+
		"\u0bc9\7\u016d\2\2\u0bc4\u0bc6\5\u01b4\u00db\2\u0bc5\u0bc4\3\2\2\2\u0bc5"+
		"\u0bc6\3\2\2\2\u0bc6\u0bc7\3\2\2\2\u0bc7\u0bca\5\u019e\u00d0\2\u0bc8\u0bca"+
		"\7\u016b\2\2\u0bc9\u0bc5\3\2\2\2\u0bc9\u0bc8\3\2\2\2\u0bca\u0bcb\3\2\2"+
		"\2\u0bcb\u0bcd\7\u0170\2\2\u0bcc\u0bce\5\u01b6\u00dc\2\u0bcd\u0bcc\3\2"+
		"\2\2\u0bcd\u0bce\3\2\2\2\u0bce\u0c44\3\2\2\2\u0bcf\u0bd0\7\u0146\2\2\u0bd0"+
		"\u0bd1\7\u016d\2\2\u0bd1\u0bd2\7\u0170\2\2\u0bd2\u0c44\5\u01b6\u00dc\2"+
		"\u0bd3\u0bd4\7\u014a\2\2\u0bd4\u0bd5\7\u016d\2\2\u0bd5\u0bd6\7\u0170\2"+
		"\2\u0bd6\u0c44\5\u01b6\u00dc\2\u0bd7\u0bd8\7\u014b\2\2\u0bd8\u0bd9\7\u016d"+
		"\2\2\u0bd9\u0bda\5\u019e\u00d0\2\u0bda\u0bdb\7\u0170\2\2\u0bdb\u0bdc\5"+
		"\u01b6\u00dc\2\u0bdc\u0c44\3\2\2\2\u0bdd\u0bde\7\u014c\2\2\u0bde\u0bdf"+
		"\7\u016d\2\2\u0bdf\u0be6\5\u019e\u00d0\2\u0be0\u0be1\7\u015f\2\2\u0be1"+
		"\u0be4\5\u019e\u00d0\2\u0be2\u0be3\7\u015f\2\2\u0be3\u0be5\5\u019e\u00d0"+
		"\2\u0be4\u0be2\3\2\2\2\u0be4\u0be5\3\2\2\2\u0be5\u0be7\3\2\2\2\u0be6\u0be0"+
		"\3\2\2\2\u0be6\u0be7\3\2\2\2\u0be7\u0be8\3\2\2\2\u0be8\u0be9\7\u0170\2"+
		"\2\u0be9\u0bea\5\u01b6\u00dc\2\u0bea\u0c44\3\2\2\2\u0beb\u0bec\7\u014d"+
		"\2\2\u0bec\u0bed\7\u016d\2\2\u0bed\u0bee\5\u019e\u00d0\2\u0bee\u0bef\7"+
		"\u0170\2\2\u0bef\u0bf0\5\u01b6\u00dc\2\u0bf0\u0c44\3\2\2\2\u0bf1\u0bf2"+
		"\7\u014e\2\2\u0bf2\u0bf3\7\u016d\2\2\u0bf3\u0bfa\5\u019e\u00d0\2\u0bf4"+
		"\u0bf5\7\u015f\2\2\u0bf5\u0bf8\5\u019e\u00d0\2\u0bf6\u0bf7\7\u015f\2\2"+
		"\u0bf7\u0bf9\5\u019e\u00d0\2\u0bf8\u0bf6\3\2\2\2\u0bf8\u0bf9\3\2\2\2\u0bf9"+
		"\u0bfb\3\2\2\2\u0bfa\u0bf4\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u0bfc\3\2"+
		"\2\2\u0bfc\u0bfd\7\u0170\2\2\u0bfd\u0bfe\5\u01b6\u00dc\2\u0bfe\u0c44\3"+
		"\2\2\2\u0bff\u0c00\7\u00b6\2\2\u0c00\u0c02\7\u016d\2\2\u0c01\u0c03\5\u01b4"+
		"\u00db\2\u0c02\u0c01\3\2\2\2\u0c02\u0c03\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04"+
		"\u0c05\5\u019e\u00d0\2\u0c05\u0c07\7\u0170\2\2\u0c06\u0c08\5\u01b6\u00dc"+
		"\2\u0c07\u0c06\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08\u0c44\3\2\2\2\u0c09\u0c0a"+
		"\7\u00bc\2\2\u0c0a\u0c0c\7\u016d\2\2\u0c0b\u0c0d\5\u01b4\u00db\2\u0c0c"+
		"\u0c0b\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c0e\3\2\2\2\u0c0e\u0c0f\5\u019e"+
		"\u00d0\2\u0c0f\u0c11\7\u0170\2\2\u0c10\u0c12\5\u01b6\u00dc\2\u0c11\u0c10"+
		"\3\2\2\2\u0c11\u0c12\3\2\2\2\u0c12\u0c44\3\2\2\2\u0c13\u0c14\7\u0157\2"+
		"\2\u0c14\u0c15\7\u016d\2\2\u0c15\u0c16\7\u0170\2\2\u0c16\u0c44\5\u01b6"+
		"\u00dc\2\u0c17\u0c18\7\u0158\2\2\u0c18\u0c19\7\u016d\2\2\u0c19\u0c1a\7"+
		"\u0170\2\2\u0c1a\u0c44\5\u01b6\u00dc\2\u0c1b\u0c1c\7\u0159\2\2\u0c1c\u0c1e"+
		"\7\u016d\2\2\u0c1d\u0c1f\5\u01b4\u00db\2\u0c1e\u0c1d\3\2\2\2\u0c1e\u0c1f"+
		"\3\2\2\2\u0c1f\u0c20\3\2\2\2\u0c20\u0c21\5\u019e\u00d0\2\u0c21\u0c23\7"+
		"\u0170\2\2\u0c22\u0c24\5\u01b6\u00dc\2\u0c23\u0c22\3\2\2\2\u0c23\u0c24"+
		"\3\2\2\2\u0c24\u0c44\3\2\2\2\u0c25\u0c26\7\u011d\2\2\u0c26\u0c28\7\u016d"+
		"\2\2\u0c27\u0c29\5\u01b4\u00db\2\u0c28\u0c27\3\2\2\2\u0c28\u0c29\3\2\2"+
		"\2\u0c29\u0c2a\3\2\2\2\u0c2a\u0c2b\5\u019e\u00d0\2\u0c2b\u0c2d\7\u0170"+
		"\2\2\u0c2c\u0c2e\5\u01b6\u00dc\2\u0c2d\u0c2c\3\2\2\2\u0c2d\u0c2e\3\2\2"+
		"\2\u0c2e\u0c44\3\2\2\2\u0c2f\u0c30\7\u0137\2\2\u0c30\u0c32\7\u016d\2\2"+
		"\u0c31\u0c33\5\u01b4\u00db\2\u0c32\u0c31\3\2\2\2\u0c32\u0c33\3\2\2\2\u0c33"+
		"\u0c34\3\2\2\2\u0c34\u0c35\5\u019e\u00d0\2\u0c35\u0c37\7\u0170\2\2\u0c36"+
		"\u0c38\5\u01b6\u00dc\2\u0c37\u0c36\3\2\2\2\u0c37\u0c38\3\2\2\2\u0c38\u0c44"+
		"\3\2\2\2\u0c39\u0c3a\7\u015b\2\2\u0c3a\u0c3c\7\u016d\2\2\u0c3b\u0c3d\5"+
		"\u01b4\u00db\2\u0c3c\u0c3b\3\2\2\2\u0c3c\u0c3d\3\2\2\2\u0c3d\u0c3e\3\2"+
		"\2\2\u0c3e\u0c3f\5\u019e\u00d0\2\u0c3f\u0c41\7\u0170\2\2\u0c40\u0c42\5"+
		"\u01b6\u00dc\2\u0c41\u0c40\3\2\2\2\u0c41\u0c42\3\2\2\2\u0c42\u0c44\3\2"+
		"\2\2\u0c43\u0bab\3\2\2\2\u0c43\u0bb5\3\2\2\2\u0c43\u0bc2\3\2\2\2\u0c43"+
		"\u0bcf\3\2\2\2\u0c43\u0bd3\3\2\2\2\u0c43\u0bd7\3\2\2\2\u0c43\u0bdd\3\2"+
		"\2\2\u0c43\u0beb\3\2\2\2\u0c43\u0bf1\3\2\2\2\u0c43\u0bff\3\2\2\2\u0c43"+
		"\u0c09\3\2\2\2\u0c43\u0c13\3\2\2\2\u0c43\u0c17\3\2\2\2\u0c43\u0c1b\3\2"+
		"\2\2\u0c43\u0c25\3\2\2\2\u0c43\u0c2f\3\2\2\2\u0c43\u0c39\3\2\2\2\u0c44"+
		"\u01b3\3\2\2\2\u0c45\u0c46\t(\2\2\u0c46\u01b5\3\2\2\2\u0c47\u0c48\7\u00d4"+
		"\2\2\u0c48\u0c4a\7\u016d\2\2\u0c49\u0c4b\5\u01b8\u00dd\2\u0c4a\u0c49\3"+
		"\2\2\2\u0c4a\u0c4b\3\2\2\2\u0c4b\u0c4d\3\2\2\2\u0c4c\u0c4e\5\u0172\u00ba"+
		"\2\u0c4d\u0c4c\3\2\2\2\u0c4d\u0c4e\3\2\2\2\u0c4e\u0c4f\3\2\2\2\u0c4f\u0c50"+
		"\7\u0170\2\2\u0c50\u01b7\3\2\2\2\u0c51\u0c52\7\u00d8\2\2\u0c52\u0c53\7"+
		"#\2\2\u0c53\u0c58\5\u019e\u00d0\2\u0c54\u0c55\7\u015f\2\2\u0c55\u0c57"+
		"\5\u019e\u00d0\2\u0c56\u0c54\3\2\2\2\u0c57\u0c5a\3\2\2\2\u0c58\u0c56\3"+
		"\2\2\2\u0c58\u0c59\3\2\2\2\u0c59\u01b9\3\2\2\2\u0c5a\u0c58\3\2\2\2\u0c5b"+
		"\u0d24\7\u0145\2\2\u0c5c\u0c5d\7*\2\2\u0c5d\u0c5e\7\u016d\2\2\u0c5e\u0c5f"+
		"\5\u019e\u00d0\2\u0c5f\u0c60\7\23\2\2\u0c60\u0c62\5\u0094K\2\u0c61\u0c63"+
		"\5\u0096L\2\u0c62\u0c61\3\2\2\2\u0c62\u0c63\3\2\2\2\u0c63\u0c64\3\2\2"+
		"\2\u0c64\u0c65\7\u0170\2\2\u0c65\u0d24\3\2\2\2\u0c66\u0c67\7>\2\2\u0c67"+
		"\u0c6a\7\u016d\2\2\u0c68\u0c6b\5\u019e\u00d0\2\u0c69\u0c6b\7\u016b\2\2"+
		"\u0c6a\u0c68\3\2\2\2\u0c6a\u0c69\3\2\2\2\u0c6b\u0c6c\3\2\2\2\u0c6c\u0d24"+
		"\7\u0170\2\2\u0c6d\u0d24\7\u0147\2\2\u0c6e\u0c6f\7D\2\2\u0c6f\u0d24\7"+
		"I\2\2\u0c70\u0c74\7\u0148\2\2\u0c71\u0c72\7D\2\2\u0c72\u0c74\7\u0126\2"+
		"\2\u0c73\u0c70\3\2\2\2\u0c73\u0c71\3\2\2\2\u0c74\u0c79\3\2\2\2\u0c75\u0c76"+
		"\7\u016d\2\2\u0c76\u0c77\5\u019e\u00d0\2\u0c77\u0c78\7\u0170\2\2\u0c78"+
		"\u0c7a\3\2\2\2\u0c79\u0c75\3\2\2\2\u0c79\u0c7a\3\2\2\2\u0c7a\u0d24\3\2"+
		"\2\2\u0c7b\u0d24\7\u0149\2\2\u0c7c\u0c7d\7D\2\2\u0c7d\u0d24\7\u015c\2"+
		"\2\u0c7e\u0c7f\7\u014f\2\2\u0c7f\u0c80\7\u016d\2\2\u0c80\u0c8d\5\u019e"+
		"\u00d0\2\u0c81\u0c82\7\u015f\2\2\u0c82\u0c8a\5\u019e\u00d0\2\u0c83\u0c84"+
		"\7\u015f\2\2\u0c84\u0c85\5\u019e\u00d0\2\u0c85\u0c86\7\u0163\2\2\u0c86"+
		"\u0c87\5\u019e\u00d0\2\u0c87\u0c89\3\2\2\2\u0c88\u0c83\3\2\2\2\u0c89\u0c8c"+
		"\3\2\2\2\u0c8a\u0c88\3\2\2\2\u0c8a\u0c8b\3\2\2\2\u0c8b\u0c8e\3\2\2\2\u0c8c"+
		"\u0c8a\3\2\2\2\u0c8d\u0c81\3\2\2\2\u0c8d\u0c8e\3\2\2\2\u0c8e\u0c8f\3\2"+
		"\2\2\u0c8f\u0c90\7\u0170\2\2\u0c90\u0d24\3\2\2\2\u0c91\u0c92\7\u0150\2"+
		"\2\u0c92\u0c93\7\u016d\2\2\u0c93\u0ca0\5\u019e\u00d0\2\u0c94\u0c95\7\u015f"+
		"\2\2\u0c95\u0c9d\5\u019e\u00d0\2\u0c96\u0c97\7\u015f\2\2\u0c97\u0c98\5"+
		"\u019e\u00d0\2\u0c98\u0c99\7\u0163\2\2\u0c99\u0c9a\5\u019e\u00d0\2\u0c9a"+
		"\u0c9c\3\2\2\2\u0c9b\u0c96\3\2\2\2\u0c9c\u0c9f\3\2\2\2\u0c9d\u0c9b\3\2"+
		"\2\2\u0c9d\u0c9e\3\2\2\2\u0c9e\u0ca1\3\2\2\2\u0c9f\u0c9d\3\2\2\2\u0ca0"+
		"\u0c94\3\2\2\2\u0ca0\u0ca1\3\2\2\2\u0ca1\u0ca2\3\2\2\2\u0ca2\u0ca3\7\u0170"+
		"\2\2\u0ca3\u0d24\3\2\2\2\u0ca4\u0ca5\7\u0151\2\2\u0ca5\u0ca6\7\u016d\2"+
		"\2\u0ca6\u0cb3\5\u019e\u00d0\2\u0ca7\u0ca8\7\u015f\2\2\u0ca8\u0cb0\5\u019e"+
		"\u00d0\2\u0ca9\u0caa\7\u015f\2\2\u0caa\u0cab\5\u019e\u00d0\2\u0cab\u0cac"+
		"\7\u0163\2\2\u0cac\u0cad\5\u019e\u00d0\2\u0cad\u0caf\3\2\2\2\u0cae\u0ca9"+
		"\3\2\2\2\u0caf\u0cb2\3\2\2\2\u0cb0\u0cae\3\2\2\2\u0cb0\u0cb1\3\2\2\2\u0cb1"+
		"\u0cb4\3\2\2\2\u0cb2\u0cb0\3\2\2\2\u0cb3\u0ca7\3\2\2\2\u0cb3\u0cb4\3\2"+
		"\2\2\u0cb4\u0cb5\3\2\2\2\u0cb5\u0cb6\7\u0170\2\2\u0cb6\u0d24\3\2\2\2\u0cb7"+
		"\u0cb8\7\u0152\2\2\u0cb8\u0cb9\7\u016d\2\2\u0cb9\u0cc6\5\u019e\u00d0\2"+
		"\u0cba\u0cbb\7\u015f\2\2\u0cbb\u0cc3\5\u019e\u00d0\2\u0cbc\u0cbd\7\u015f"+
		"\2\2\u0cbd\u0cbe\5\u019e\u00d0\2\u0cbe\u0cbf\7\u0163\2\2\u0cbf\u0cc0\5"+
		"\u019e\u00d0\2\u0cc0\u0cc2\3\2\2\2\u0cc1\u0cbc\3\2\2\2\u0cc2\u0cc5\3\2"+
		"\2\2\u0cc3\u0cc1\3\2\2\2\u0cc3\u0cc4\3\2\2\2\u0cc4\u0cc7\3\2\2\2\u0cc5"+
		"\u0cc3\3\2\2\2\u0cc6\u0cba\3\2\2\2\u0cc6\u0cc7\3\2\2\2\u0cc7\u0cc8\3\2"+
		"\2\2\u0cc8\u0cc9\7\u0170\2\2\u0cc9\u0d24\3\2\2\2\u0cca\u0ccb\7\u0153\2"+
		"\2\u0ccb\u0ccc\7\u016d\2\2\u0ccc\u0cd9\5\u019e\u00d0\2\u0ccd\u0cce\7\u015f"+
		"\2\2\u0cce\u0cd6\5\u019e\u00d0\2\u0ccf\u0cd0\7\u015f\2\2\u0cd0\u0cd1\5"+
		"\u019e\u00d0\2\u0cd1\u0cd2\7\u0163\2\2\u0cd2\u0cd3\5\u019e\u00d0\2\u0cd3"+
		"\u0cd5\3\2\2\2\u0cd4\u0ccf\3\2\2\2\u0cd5\u0cd8\3\2\2\2\u0cd6\u0cd4\3\2"+
		"\2\2\u0cd6\u0cd7\3\2\2\2\u0cd7\u0cda\3\2\2\2\u0cd8\u0cd6\3\2\2\2\u0cd9"+
		"\u0ccd\3\2\2\2\u0cd9\u0cda\3\2\2\2\u0cda\u0cdb\3\2\2\2\u0cdb\u0cdc\7\u0170"+
		"\2\2\u0cdc\u0d24\3\2\2\2\u0cdd\u0cde\7\u0154\2\2\u0cde\u0cdf\7\u016d\2"+
		"\2\u0cdf\u0cec\5\u019e\u00d0\2\u0ce0\u0ce1\7\u015f\2\2\u0ce1\u0ce9\5\u019e"+
		"\u00d0\2\u0ce2\u0ce3\7\u015f\2\2\u0ce3\u0ce4\5\u019e\u00d0\2\u0ce4\u0ce5"+
		"\7\u0163\2\2\u0ce5\u0ce6\5\u019e\u00d0\2\u0ce6\u0ce8\3\2\2\2\u0ce7\u0ce2"+
		"\3\2\2\2\u0ce8\u0ceb\3\2\2\2\u0ce9\u0ce7\3\2\2\2\u0ce9\u0cea\3\2\2\2\u0cea"+
		"\u0ced\3\2\2\2\u0ceb\u0ce9\3\2\2\2\u0cec\u0ce0\3\2\2\2\u0cec\u0ced\3\2"+
		"\2\2\u0ced\u0cee\3\2\2\2\u0cee\u0cef\7\u0170\2\2\u0cef\u0d24\3\2\2\2\u0cf0"+
		"\u0cf1\7\u0155\2\2\u0cf1\u0cf2\7\u016d\2\2\u0cf2\u0cfa\5\u019e\u00d0\2"+
		"\u0cf3\u0cf4\7\u015f\2\2\u0cf4\u0cf5\5\u019e\u00d0\2\u0cf5\u0cf6\7\u0163"+
		"\2\2\u0cf6\u0cf7\5\u019e\u00d0\2\u0cf7\u0cf9\3\2\2\2\u0cf8\u0cf3\3\2\2"+
		"\2\u0cf9\u0cfc\3\2\2\2\u0cfa\u0cf8\3\2\2\2\u0cfa\u0cfb\3\2\2\2\u0cfb\u0cfd"+
		"\3\2\2\2\u0cfc\u0cfa\3\2\2\2\u0cfd\u0cfe\7\u0170\2\2\u0cfe\u0d24\3\2\2"+
		"\2\u0cff\u0d00\7\u0156\2\2\u0d00\u0d01\7\u016d\2\2\u0d01\u0d07\5\u019e"+
		"\u00d0\2\u0d02\u0d03\7\u015f\2\2\u0d03\u0d04\5\u019e\u00d0\2\u0d04\u0d05"+
		"\7\u0163\2\2\u0d05\u0d06\5\u019e\u00d0\2\u0d06\u0d08\3\2\2\2\u0d07\u0d02"+
		"\3\2\2\2\u0d08\u0d09\3\2\2\2\u0d09\u0d07\3\2\2\2\u0d09\u0d0a\3\2\2\2\u0d0a"+
		"\u0d0d\3\2\2\2\u0d0b\u0d0c\7\u015f\2\2\u0d0c\u0d0e\5\u019e\u00d0\2\u0d0d"+
		"\u0d0b\3\2\2\2\u0d0d\u0d0e\3\2\2\2\u0d0e\u0d0f\3\2\2\2\u0d0f\u0d10\7\u0170"+
		"\2\2\u0d10\u0d24\3\2\2\2\u0d11\u0d12\7\u00fd\2\2\u0d12\u0d13\7\u016d\2"+
		"\2\u0d13\u0d14\5\u019e\u00d0\2\u0d14\u0d15\7\u0170\2\2\u0d15\u0d24\3\2"+
		"\2\2\u0d16\u0d17\7\u011c\2\2\u0d17\u0d18\7\u016d\2\2\u0d18\u0d19\5\u019e"+
		"\u00d0\2\u0d19\u0d1a\7|\2\2\u0d1a\u0d1d\5\u019e\u00d0\2\u0d1b\u0d1c\7"+
		"x\2\2\u0d1c\u0d1e\5\u019e\u00d0\2\u0d1d\u0d1b\3\2\2\2\u0d1d\u0d1e\3\2"+
		"\2\2\u0d1e\u0d1f\3\2\2\2\u0d1f\u0d20\7\u0170\2\2\u0d20\u0d24\3\2\2\2\u0d21"+
		"\u0d24\7\u015a\2\2\u0d22\u0d24\7\u015c\2\2\u0d23\u0c5b\3\2\2\2\u0d23\u0c5c"+
		"\3\2\2\2\u0d23\u0c66\3\2\2\2\u0d23\u0c6d\3\2\2\2\u0d23\u0c6e\3\2\2\2\u0d23"+
		"\u0c73\3\2\2\2\u0d23\u0c7b\3\2\2\2\u0d23\u0c7c\3\2\2\2\u0d23\u0c7e\3\2"+
		"\2\2\u0d23\u0c91\3\2\2\2\u0d23\u0ca4\3\2\2\2\u0d23\u0cb7\3\2\2\2\u0d23"+
		"\u0cca\3\2\2\2\u0d23\u0cdd\3\2\2\2\u0d23\u0cf0\3\2\2\2\u0d23\u0cff\3\2"+
		"\2\2\u0d23\u0d11\3\2\2\2\u0d23\u0d16\3\2\2\2\u0d23\u0d21\3\2\2\2\u0d23"+
		"\u0d22\3\2\2\2\u0d24\u01bb\3\2\2\2\u0d25\u0d26\5\u01d6\u00ec\2\u0d26\u0d28"+
		"\7\u016d\2\2\u0d27\u0d29\5\u01be\u00e0\2\u0d28\u0d27\3\2\2\2\u0d28\u0d29"+
		"\3\2\2\2\u0d29\u0d2a\3\2\2\2\u0d2a\u0d2b\7\u0170\2\2\u0d2b\u01bd\3\2\2"+
		"\2\u0d2c\u0d31\5\u01c0\u00e1\2\u0d2d\u0d2e\7\u015f\2\2\u0d2e\u0d30\5\u01c0"+
		"\u00e1\2\u0d2f\u0d2d\3\2\2\2\u0d30\u0d33\3\2\2\2\u0d31\u0d2f\3\2\2\2\u0d31"+
		"\u0d32\3\2\2\2\u0d32\u01bf\3\2\2\2\u0d33\u0d31\3\2\2\2\u0d34\u0d3a\6\u00e1"+
		"\16\2\u0d35\u0d36\5\u01d6\u00ec\2\u0d36\u0d38\7\u0163\2\2\u0d37\u0d39"+
		"\7\u0167\2\2\u0d38\u0d37\3\2\2\2\u0d38\u0d39\3\2\2\2\u0d39\u0d3b\3\2\2"+
		"\2\u0d3a\u0d35\3\2\2\2\u0d3a\u0d3b\3\2\2\2\u0d3b\u0d3c\3\2\2\2\u0d3c\u0d3d"+
		"\5\u019e\u00d0\2\u0d3d\u01c1\3\2\2\2\u0d3e\u0d41\5\u0138\u009d\2\u0d3f"+
		"\u0d41\5\u019e\u00d0\2\u0d40\u0d3e\3\2\2\2\u0d40\u0d3f\3\2\2\2\u0d41\u01c3"+
		"\3\2\2\2\u0d42\u0d45\5\u01d0\u00e9\2\u0d43\u0d45\5\u019e\u00d0\2\u0d44"+
		"\u0d42\3\2\2\2\u0d44\u0d43\3\2\2\2\u0d45\u01c5\3\2\2\2\u0d46\u0d4a\7\u0088"+
		"\2\2\u0d47\u0d49\5\u01c8\u00e5\2\u0d48\u0d47\3\2\2\2\u0d49\u0d4c\3\2\2"+
		"\2\u0d4a\u0d48\3\2\2\2\u0d4a\u0d4b\3\2\2\2\u0d4b\u01c7\3\2\2\2\u0d4c\u0d4a"+
		"\3\2\2\2\u0d4d\u0d4e\7\u0173\2\2\u0d4e\u0d4f\5\u01d6\u00ec\2\u0d4f\u0d50"+
		"\5\u019e\u00d0\2\u0d50\u0d5a\3\2\2\2\u0d51\u0d52\7\u0173\2\2\u0d52\u0d53"+
		"\5\u01d6\u00ec\2\u0d53\u0d54\7\u0174\2\2\u0d54\u0d55\7\u0163\2\2\u0d55"+
		"\u0d56\5\u019e\u00d0\2\u0d56\u0d5a\3\2\2\2\u0d57\u0d58\7\u0173\2\2\u0d58"+
		"\u0d5a\5\u01d6\u00ec\2\u0d59\u0d4d\3\2\2\2\u0d59\u0d51\3\2\2\2\u0d59\u0d57"+
		"\3\2\2\2\u0d5a\u01c9\3\2\2\2\u0d5b\u0d5c\7\7\2\2\u0d5c\u0d5d\5\u01cc\u00e7"+
		"\2\u0d5d\u0d5e\7\u0172\2\2\u0d5e\u0d61\3\2\2\2\u0d5f\u0d61\5\u01ce\u00e8"+
		"\2\u0d60\u0d5b\3\2\2\2\u0d60\u0d5f\3\2\2\2\u0d61\u01cb\3\2\2\2\u0d62\u0d64"+
		"\13\2\2\2\u0d63\u0d62\3\2\2\2\u0d64\u0d67\3\2\2\2\u0d65\u0d66\3\2\2\2"+
		"\u0d65\u0d63\3\2\2\2\u0d66\u01cd\3\2\2\2\u0d67\u0d65\3\2\2\2\u0d68\u0d69"+
		"\7\u0089\2\2\u0d69\u0d6a\5\u019e\u00d0\2\u0d6a\u01cf\3\2\2\2\u0d6b\u0d7a"+
		"\7\u017c\2\2\u0d6c\u0d70\7\u0161\2\2\u0d6d\u0d6e\7\6\2\2\u0d6e\u0d70\7"+
		"\u0161\2\2\u0d6f\u0d6c\3\2\2\2\u0d6f\u0d6d\3\2\2\2\u0d6f\u0d70\3\2\2\2"+
		"\u0d70\u0d71\3\2\2\2\u0d71\u0d76\5\u01d6\u00ec\2\u0d72\u0d73\7\u0161\2"+
		"\2\u0d73\u0d75\5\u01d6\u00ec\2\u0d74\u0d72\3\2\2\2\u0d75\u0d78\3\2\2\2"+
		"\u0d76\u0d74\3\2\2\2\u0d76\u0d77\3\2\2\2\u0d77\u0d7a\3\2\2\2\u0d78\u0d76"+
		"\3\2\2\2\u0d79\u0d6b\3\2\2\2\u0d79\u0d6f\3\2\2\2\u0d7a\u01d1\3\2\2\2\u0d7b"+
		"\u0d7c\7I\2\2\u0d7c\u0d7d\5\u01d8\u00ed\2\u0d7d\u01d3\3\2\2\2\u0d7e\u0d7f"+
		"\7\u0126\2\2\u0d7f\u0d80\5\u01d8\u00ed\2\u0d80\u01d5\3\2\2\2\u0d81\u0d84"+
		"\7\u0174\2\2\u0d82\u0d84\5\u01e2\u00f2\2\u0d83\u0d81\3\2\2\2\u0d83\u0d82"+
		"\3\2\2\2\u0d84\u0d8c\3\2\2\2\u0d85\u0d88\7\6\2\2\u0d86\u0d89\7\u0174\2"+
		"\2\u0d87\u0d89\5\u01e2\u00f2\2\u0d88\u0d86\3\2\2\2\u0d88\u0d87\3\2\2\2"+
		"\u0d89\u0d8b\3\2\2\2\u0d8a\u0d85\3\2\2\2\u0d8b\u0d8e\3\2\2\2\u0d8c\u0d8a"+
		"\3\2\2\2\u0d8c\u0d8d\3\2\2\2\u0d8d\u01d7\3\2\2\2\u0d8e\u0d8c\3\2\2\2\u0d8f"+
		"\u0d92\7\u0175\2\2\u0d90\u0d92\7\u0176\2\2\u0d91\u0d8f\3\2\2\2\u0d91\u0d90"+
		"\3\2\2\2\u0d92\u01d9\3\2\2\2\u0d93\u0d95\t\62\2\2\u0d94\u0d93\3\2\2\2"+
		"\u0d94\u0d95\3\2\2\2\u0d95\u0d96\3\2\2\2\u0d96\u0d97\7\u0177\2\2\u0d97"+
		"\u01db\3\2\2\2\u0d98\u0d9a\t\62\2\2\u0d99\u0d98\3\2\2\2\u0d99\u0d9a\3"+
		"\2\2\2\u0d9a\u0d9b\3\2\2\2\u0d9b\u0d9c\7\u0178\2\2\u0d9c\u01dd\3\2\2\2"+
		"\u0d9d\u0d9e\t\63\2\2\u0d9e\u01df\3\2\2\2\u0d9f\u0da0\7\u00c8\2\2\u0da0"+
		"\u01e1\3\2\2\2\u0da1\u0da2\t\64\2\2\u0da2\u01e3\3\2\2\2\u01b3\u01e9\u01ec"+
		"\u01f0\u01f3\u01f8\u01ff\u0205\u0207\u0210\u0213\u0215\u0257\u025f\u026f"+
		"\u0276\u0279\u027e\u0282\u028b\u0290\u0298\u029d\u02a6\u02b2\u02b7\u02ba"+
		"\u02c8\u02cf\u02d8\u02e9\u02ed\u02f5\u0300\u030a\u0312\u0319\u031d\u0321"+
		"\u0326\u032a\u032f\u0333\u0337\u0341\u0345\u034a\u034f\u0353\u0360\u0365"+
		"\u036b\u0374\u0378\u0380\u0383\u0388\u038d\u0394\u039b\u039e\u03a1\u03a8"+
		"\u03ae\u03b3\u03b9\u03be\u03c1\u03cd\u03cf\u03dd\u03e1\u03e7\u03f6\u0403"+
		"\u0409\u0415\u042a\u0431\u0437\u043e\u0444\u0452\u045c\u0462\u0467\u046c"+
		"\u0471\u0475\u047a\u047d\u0487\u0493\u049a\u049d\u04a9\u04ae\u04b3\u04b6"+
		"\u04c9\u04d6\u04d8\u04dd\u04e0\u04ef\u04f5\u0500\u0503\u050d\u0514\u0533"+
		"\u0539\u053d\u0542\u0546\u054b\u054e\u0553\u0556\u0562\u0569\u056e\u0573"+
		"\u0577\u057c\u057f\u0589\u0595\u059c\u05a4\u05b2\u05d1\u05d3\u05d8\u05dc"+
		"\u05e1\u05e8\u05eb\u05ee\u05f3\u05f7\u05f9\u0600\u0606\u060d\u0613\u0616"+
		"\u061b\u061f\u0622\u0629\u062f\u0632\u063c\u0645\u064c\u0653\u0655\u065b"+
		"\u065e\u0669\u0672\u0678\u067e\u0681\u0686\u0689\u068c\u068f\u0692\u0698"+
		"\u06a2\u06ad\u06b0\u06b7\u06bc\u06c1\u06c5\u06cd\u06d1\u06d6\u06da\u06dc"+
		"\u06e1\u06e9\u06ee\u06f4\u06fb\u06fe\u0705\u070d\u0715\u0718\u071b\u0720"+
		"\u072c\u0730\u073c\u074f\u0756\u0758\u075c\u0760\u0768\u0773\u077c\u0784"+
		"\u078c\u0790\u0798\u07aa\u07b8\u07bf\u07c3\u07ca\u07cc\u07d0\u07d9\u07e1"+
		"\u07ea\u07fa\u0800\u0804\u080e\u0816\u081f\u0823\u0829\u082e\u0832\u083c"+
		"\u0842\u0846\u0852\u0859\u0869\u0870\u087a\u087d\u0881\u0888\u088f\u0891"+
		"\u0895\u0899\u089e\u08a1\u08a5\u08a8\u08b3\u08b6\u08c1\u08c7\u08cb\u08cd"+
		"\u08d1\u08da\u08e1\u08e5\u08e9\u08f0\u08f4\u08fc\u0902\u0906\u0911\u0918"+
		"\u0925\u092d\u0931\u093b\u0940\u094d\u0958\u0960\u0964\u0968\u096c\u096e"+
		"\u0973\u0976\u0979\u097c\u0980\u0983\u0986\u0989\u098c\u0993\u099e\u09a2"+
		"\u09a5\u09a9\u09b0\u09b4\u09be\u09c6\u09cc\u09d0\u09d6\u09df\u09e2\u09e7"+
		"\u09ea\u09f4\u09f9\u0a02\u0a07\u0a0b\u0a14\u0a18\u0a26\u0a33\u0a38\u0a3c"+
		"\u0a42\u0a4d\u0a4f\u0a56\u0a59\u0a60\u0a65\u0a6b\u0a6e\u0a71\u0a80\u0a87"+
		"\u0a8a\u0a8d\u0a91\u0a96\u0a9c\u0aa0\u0aab\u0aaf\u0ab2\u0ab6\u0aba\u0abe"+
		"\u0ac2\u0ac8\u0ace\u0ad5\u0add\u0ae3\u0ae8\u0af3\u0afc\u0b00\u0b09\u0b0d"+
		"\u0b17\u0b1c\u0b32\u0b35\u0b48\u0b58\u0b5a\u0b65\u0b74\u0b80\u0b84\u0b8f"+
		"\u0b93\u0b9f\u0ba3\u0bae\u0bb3\u0bb8\u0bbc\u0bc0\u0bc5\u0bc9\u0bcd\u0be4"+
		"\u0be6\u0bf8\u0bfa\u0c02\u0c07\u0c0c\u0c11\u0c1e\u0c23\u0c28\u0c2d\u0c32"+
		"\u0c37\u0c3c\u0c41\u0c43\u0c4a\u0c4d\u0c58\u0c62\u0c6a\u0c73\u0c79\u0c8a"+
		"\u0c8d\u0c9d\u0ca0\u0cb0\u0cb3\u0cc3\u0cc6\u0cd6\u0cd9\u0ce9\u0cec\u0cfa"+
		"\u0d09\u0d0d\u0d1d\u0d23\u0d28\u0d31\u0d38\u0d3a\u0d40\u0d44\u0d4a\u0d59"+
		"\u0d60\u0d65\u0d6f\u0d76\u0d79\u0d83\u0d88\u0d8c\u0d91\u0d94\u0d99";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}