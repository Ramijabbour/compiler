// Generated from D:/compiler/src\g.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(gParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(gParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(gParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(gParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(gParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(gParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(gParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(gParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(gParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(gParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(gParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(gParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(gParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(gParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(gParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(gParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_cursor_stmt(gParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociate_locator_stmt(gParser.Associate_locator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_transaction_stmt(gParser.Begin_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(gParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(gParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(gParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(gParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(gParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(gParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(gParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(gParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(gParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(gParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(gParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(gParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(gParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(gParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(gParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(gParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(gParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(gParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(gParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(gParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(gParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#global_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_scope(gParser.Global_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_end(gParser.Function_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function_stmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_stmnt(gParser.Function_stmntContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#pars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPars(gParser.ParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#varss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarss(gParser.VarssContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dtypee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtypee(gParser.DtypeeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(gParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(gParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#end_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_for(gParser.End_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#for_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_type(gParser.For_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(gParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(gParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(gParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(gParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(gParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(gParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(gParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(gParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_options_ed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ed(gParser.Create_table_options_edContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(gParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(gParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(gParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(gParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(gParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(gParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(gParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(gParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(gParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(gParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#alter_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_item(gParser.Alter_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(gParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint_item(gParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(gParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(gParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(gParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(gParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(gParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(gParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(gParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(gParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(gParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(gParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(gParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(gParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(gParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(gParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(gParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(gParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(gParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(gParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(gParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(gParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_transaction_stmt(gParser.End_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#exec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(gParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(gParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(gParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#end_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_if(gParser.End_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(gParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(gParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(gParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(gParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#include_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_stmt(gParser.Include_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(gParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_cols(gParser.Insert_stmt_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_rows(gParser.Insert_stmt_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_row(gParser.Insert_stmt_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_directory_stmt(gParser.Insert_directory_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(gParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt(gParser.Get_diag_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_item(gParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_exception_item(gParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_rowcount_item(gParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#grant_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt(gParser.Grant_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt_item(gParser.Grant_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#leave_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_stmt(gParser.Leave_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#map_object_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_object_stmt(gParser.Map_object_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#open_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_stmt(gParser.Open_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fetch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_stmt(gParser.Fetch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_stmt(gParser.Collect_stats_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_clause(gParser.Collect_stats_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#close_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_stmt(gParser.Close_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cmp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_stmt(gParser.Cmp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cmp_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_source(gParser.Cmp_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from_local_stmt(gParser.Copy_from_local_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#copy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_stmt(gParser.Copy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#copy_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_source(gParser.Copy_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#copy_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_target(gParser.Copy_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#copy_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option(gParser.Copy_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#copy_file_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_option(gParser.Copy_file_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(gParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(gParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(gParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(gParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(gParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(gParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#quit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit_stmt(gParser.Quit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(gParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#resignal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignal_stmt(gParser.Resignal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(gParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(gParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#set_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_option(gParser.Set_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_current_schema_option(gParser.Set_current_schema_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mssql_session_option(gParser.Set_mssql_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_teradata_session_option(gParser.Set_teradata_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#signal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_stmt(gParser.Signal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#summary_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary_stmt(gParser.Summary_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#truncate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_stmt(gParser.Truncate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#use_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_stmt(gParser.Use_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#values_into_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_into_stmt(gParser.Values_into_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(gParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cursor_stmt(gParser.For_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(gParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(gParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(gParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(gParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(gParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(gParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(gParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(gParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(gParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(gParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(gParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(gParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(gParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(gParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(gParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(gParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(gParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(gParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(gParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(gParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(gParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(gParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(gParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(gParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(gParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(gParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(gParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(gParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(gParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(gParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(gParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(gParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(gParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(gParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(gParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(gParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#update_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_assignment(gParser.Update_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#update_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_table(gParser.Update_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#update_upsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_upsert(gParser.Update_upsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#merge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_stmt(gParser.Merge_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#merge_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_table(gParser.Merge_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#merge_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_condition(gParser.Merge_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#merge_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_action(gParser.Merge_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(gParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#delete_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_alias(gParser.Delete_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(gParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(gParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(gParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(gParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(gParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(gParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(gParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(gParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(gParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(gParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(gParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(gParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(gParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(gParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(gParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(gParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(gParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(gParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(gParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(gParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(gParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(gParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(gParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(gParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(gParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(gParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(gParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_select(gParser.Expr_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_file(gParser.Expr_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#hive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive(gParser.HiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive_item(gParser.Hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(gParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#host_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_cmd(gParser.Host_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#host_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_stmt(gParser.Host_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(gParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(gParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(gParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(gParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link gParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(gParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link gParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(gParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(gParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(gParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(gParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(gParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(gParser.Non_reserved_wordsContext ctx);
}